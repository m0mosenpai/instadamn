package X;

import com.facebook.react.bridge.ReadableMapKeySetIterator;

/* loaded from: classes10.dex */
public final class T0I implements ReadableMapKeySetIterator {
    public int A00;
    public final /* synthetic */ String[] A01;

    public T0I(String[] strArr) {
        this.A01 = strArr;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public final boolean CLQ() {
        return AbstractC167007dF.A1Q(this.A00, this.A01.length);
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public final String Csu() {
        String[] strArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return strArr[i];
    }
}
