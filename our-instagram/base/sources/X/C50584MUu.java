package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import com.instagram.newsfeed.data.ActivityPagedData;

/* renamed from: X.MUu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50584MUu extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50584MUu(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A02 |= Integer.MIN_VALUE;
        Object obj2 = this.A07;
        if (i != 0) {
            return ((ActivityPagedData) obj2).A02(null, this);
        }
        return ((BringIntoViewRequesterImpl) obj2).AEF(null, this);
    }
}
