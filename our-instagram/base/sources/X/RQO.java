package X;

import com.google.common.collect.ConcurrentHashMultiset;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class RQO extends AbstractC75163Zh<E>.EntrySet {
    public final /* synthetic */ ConcurrentHashMultiset A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQO(final ConcurrentHashMultiset this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    public final Object[] toArray(Object[] array) {
        ArrayList A17 = AbstractC25225BEi.A17(AbstractC92144Au.computeArrayListCapacity(size()));
        AbstractC63071Sbt.A02(A17, iterator());
        return A17.toArray(array);
    }

    public final Object[] toArray() {
        ArrayList A17 = AbstractC25225BEi.A17(AbstractC92144Au.computeArrayListCapacity(size()));
        AbstractC63071Sbt.A02(A17, iterator());
        return A17.toArray();
    }
}
