package X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T0H implements ReadableMapKeySetIterator {
    public Iterator A00;
    public final /* synthetic */ T0G A01;

    public T0H(T0G t0g) {
        this.A01 = t0g;
        this.A00 = AbstractC166997dE.A15(t0g.A00);
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public final boolean CLQ() {
        return this.A00.hasNext();
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public final String Csu() {
        return AbstractC31172DnG.A17(AbstractC166987dD.A1K(this.A00));
    }
}
