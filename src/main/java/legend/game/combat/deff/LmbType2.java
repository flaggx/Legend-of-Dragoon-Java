package legend.game.combat.deff;

import legend.core.memory.Value;
import legend.core.memory.types.ByteRef;
import legend.core.memory.types.IntRef;
import legend.core.memory.types.RelativePointer;
import legend.core.memory.types.ShortRef;
import legend.core.memory.types.UnboundedArrayRef;

public class LmbType2 extends Lmb {
  public final ShortRef _08;
  public final ShortRef _0a;
  public final RelativePointer<UnboundedArrayRef<IntRef>> _0c;
  public final RelativePointer<UnboundedArrayRef<LmbTransforms14>> _10;
  public final RelativePointer<UnboundedArrayRef<ByteRef>> _14;

  public LmbType2(final Value ref) {
    super(ref);

    this._08 = ref.offset(2, 0x08L).cast(ShortRef::new);
    this._0a = ref.offset(2, 0x0aL).cast(ShortRef::new);
    this._0c = ref.offset(4, 0x0cL).cast(RelativePointer.deferred(4, ref.getAddress(), UnboundedArrayRef.of(0x04, IntRef::new)));
    this._10 = ref.offset(4, 0x10L).cast(RelativePointer.deferred(4, ref.getAddress(), UnboundedArrayRef.of(0x14, LmbTransforms14::new, this.count_04::get)));
    this._14 = ref.offset(4, 0x14L).cast(RelativePointer.deferred(1, ref.getAddress(), UnboundedArrayRef.of(0x01, ByteRef::new)));
  }
}
