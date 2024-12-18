package X;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import com.instagram.compose.core.ui.IgClickableTextKt$IgClickableText$pressIndicator$1$1$1;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.9DT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DT extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DT(InterfaceC74953Yl interfaceC74953Yl, C5C8 c5c8, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A07 = z;
        this.A05 = interfaceC74953Yl;
        this.A01 = interfaceC16660sJ;
        this.A04 = c5c8;
        this.A06 = interfaceC16660sJ2;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        FriendMapRepository friendMapRepository;
        Object obj2 = obj;
        if (this.A03 != 0) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                friendMapRepository = (FriendMapRepository) this.A01;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                friendMapRepository = (FriendMapRepository) this.A02;
                C92964Eq c92964Eq = friendMapRepository.A09;
                this.A01 = friendMapRepository;
                this.A00 = 1;
                obj2 = c92964Eq.A00.A08(this);
                if (obj2 == c1jx) {
                    return c1jx;
                }
            }
            FriendMapRepository.A04(friendMapRepository, (C59589QiE) obj2, (Double) this.A04, (Double) this.A05, (InterfaceC16660sJ) this.A06, this.A07);
        } else {
            C1JX c1jx2 = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C6KN c6kn = (C6KN) this.A02;
                boolean z = this.A07;
                IgClickableTextKt$IgClickableText$pressIndicator$1$1$1 igClickableTextKt$IgClickableText$pressIndicator$1$1$1 = new IgClickableTextKt$IgClickableText$pressIndicator$1$1$1((InterfaceC74953Yl) this.A05, (C5C8) this.A04, null, (InterfaceC16660sJ) this.A01, (InterfaceC16660sJ) this.A06, z);
                this.A00 = 1;
                if (ForEachGestureKt.A01(c6kn, this, igClickableTextKt$IgClickableText$pressIndicator$1$1$1) == c1jx2) {
                    return c1jx2;
                }
            }
        }
        return C0eB.A00;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            return new C9DT((FriendMapRepository) this.A02, (Double) this.A04, (Double) this.A05, interfaceC23621Ds, (InterfaceC16660sJ) this.A06, this.A07);
        }
        boolean z = this.A07;
        C9DT c9dt = new C9DT((InterfaceC74953Yl) this.A05, (C5C8) this.A04, interfaceC23621Ds, (InterfaceC16660sJ) this.A01, (InterfaceC16660sJ) this.A06, z);
        c9dt.A02 = obj;
        return c9dt;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DT) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DT(FriendMapRepository friendMapRepository, Double d, Double d2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = friendMapRepository;
        this.A07 = z;
        this.A04 = d;
        this.A05 = d2;
        this.A06 = interfaceC16660sJ;
    }
}
