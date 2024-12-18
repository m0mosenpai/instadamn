package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.NXp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52781NXp extends EPV {
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final UserSession A00;
    public final AbstractC53643Nno A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52781NXp(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC53643Nno abstractC53643Nno) {
        super(context, userSession, interfaceC11380iw);
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        this.A01 = abstractC53643Nno;
    }

    @Override // X.EPV, X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        P14 p14;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C51277Ml0) {
            Object item = getItem(i);
            boolean z = item instanceof NJX;
            InterfaceC58169PqZ interfaceC58169PqZ = ((C51277Ml0) c3oo).A00;
            if (z) {
                if ((interfaceC58169PqZ instanceof P14) && (p14 = (P14) interfaceC58169PqZ) != null) {
                    p14.A00(((NJX) item).A00);
                    return;
                }
                return;
            }
            interfaceC58169PqZ.ADu();
            return;
        }
        super.onBindViewHolder(c3oo, i);
    }

    @Override // X.EPV, X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        InterfaceC58169PqZ p1d;
        AbstractC59962oe abstractC59962oe;
        UserSession userSession;
        boolean z;
        AbstractC59962oe abstractC59962oe2;
        boolean A052;
        C14360o3.A0B(viewGroup, 0);
        if (i == A08) {
            AbstractC53643Nno abstractC53643Nno = this.A01;
            if (abstractC53643Nno instanceof NJP) {
                NJP njp = (NJP) abstractC53643Nno;
                abstractC59962oe2 = njp.A00;
                A052 = AbstractC55222Oeo.A01(njp.A02);
            } else {
                NJO njo = (NJO) abstractC53643Nno;
                abstractC59962oe2 = njo.A01;
                A052 = AbstractC55222Oeo.A05(njo.A06);
            }
            p1d = new P14(abstractC59962oe2, null, A052);
        } else if (i == A05) {
            p1d = this.A01.A02();
        } else if (i == A07) {
            p1d = this.A01.A00();
        } else if (i == A02) {
            AbstractC53643Nno abstractC53643Nno2 = this.A01;
            if (abstractC53643Nno2 instanceof NJP) {
                NJP njp2 = (NJP) abstractC53643Nno2;
                abstractC59962oe = njp2.A00;
                userSession = njp2.A02;
                z = AbstractC55222Oeo.A01(userSession);
            } else {
                NJO njo2 = (NJO) abstractC53643Nno2;
                abstractC59962oe = njo2.A01;
                userSession = njo2.A06;
                z = false;
            }
            p1d = new P0N(abstractC59962oe, userSession, z);
        } else if (i == A06) {
            p1d = this.A01.A03();
        } else if (i == A04) {
            p1d = this.A01.A01();
        } else {
            if (i == A03) {
                AbstractC53643Nno abstractC53643Nno3 = this.A01;
                if (abstractC53643Nno3 instanceof NJP) {
                    NJP njp3 = (NJP) abstractC53643Nno3;
                    AbstractC59962oe abstractC59962oe3 = njp3.A00;
                    UserSession userSession2 = njp3.A02;
                    p1d = new P1D(abstractC59962oe3, userSession2, njp3.A0I, AbstractC55222Oeo.A01(userSession2));
                }
            }
            return super.onCreateViewHolder(viewGroup, i);
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51277Ml0(p1d.ANR(), this, p1d);
    }

    static {
        int length = C05F.A00(45).length;
        A08 = length;
        A05 = length + 1;
        A07 = length + 2;
        A02 = length + 3;
        A06 = length + 4;
        A04 = length + 5;
        A03 = length + 6;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0024. Please report as an issue. */
    @Override // X.EPV, X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int itemViewType;
        int A032 = C0f9.A03(1239319734);
        Object item = getItem(i);
        if (item instanceof NJX) {
            itemViewType = A08;
        } else if (item instanceof NJV) {
            Integer num = ((NJV) item).A00;
            switch (num.intValue()) {
                case 1:
                    itemViewType = A02;
                    break;
                case 3:
                    itemViewType = A03;
                    break;
                case 9:
                    itemViewType = A04;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    itemViewType = A06;
                    break;
                case 23:
                    itemViewType = A07;
                    break;
                case 33:
                    itemViewType = A05;
                    break;
                default:
                    IllegalArgumentException A0c = AbstractC167007dF.A0c("Unsupported RowItemEnum ", AbstractC53938NtB.A00(num));
                    C0f9.A0A(1712130553, A032);
                    throw A0c;
            }
        } else {
            itemViewType = super.getItemViewType(i);
        }
        C0f9.A0A(75093395, A032);
        return itemViewType;
    }

    @Override // X.EPV, android.widget.Adapter
    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 7;
    }
}
