package X;

import com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt;
import com.instagram.nme.contextualpromo.ContextualPromoHelper;
import com.instagram.nux.aymh.viewmodel.AggregateAccountLoginHandler;

/* renamed from: X.PWv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57143PWv extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public final int A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57143PWv(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A0C = i;
        this.A03 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C57143PWv) && ((C57143PWv) obj).A0C == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A0C) {
            case 0:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return CommentPostingRequestExtensionsKt.A01(null, null, null, null, null, null, null, null, null, null, this);
            case 1:
                this.A0B = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ContextualPromoHelper) this.A03).A02(null, this);
            case 2:
                this.A0B = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AggregateAccountLoginHandler) this.A03).A01(null, null, null, null, null, this);
            default:
                this.A0B = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((OGl) this.A03).A00(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57143PWv(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0C = 0;
    }
}
