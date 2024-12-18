package X;

import com.google.common.collect.CompactHashMap;

/* loaded from: classes10.dex */
public final class RQZ extends C49f {
    public final /* synthetic */ CompactHashMap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQZ(final CompactHashMap this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    @Override // X.C49f
    public final Object A00(int entry) {
        Object[] objArr = this.A00.keys;
        objArr.getClass();
        return objArr[entry];
    }
}
