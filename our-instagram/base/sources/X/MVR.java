package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public final class MVR extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MVR(Context context, UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 26;
        this.A05 = str;
        this.A02 = userSession;
        this.A01 = context;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        int i;
        Object obj4;
        String str2;
        Object obj5;
        int i2;
        String str3;
        Object obj6;
        Object obj7;
        Object obj8;
        int i3;
        switch (this.A04) {
            case 0:
                obj8 = this.A01;
                str3 = this.A05;
                obj6 = this.A03;
                obj7 = this.A02;
                i3 = 0;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 1:
                obj8 = this.A01;
                str3 = this.A05;
                obj7 = this.A02;
                obj6 = this.A03;
                i3 = 1;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 2:
                obj7 = this.A02;
                obj6 = this.A03;
                str3 = this.A05;
                obj8 = this.A01;
                i3 = 2;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 3:
                obj4 = this.A03;
                obj5 = this.A01;
                str2 = this.A05;
                i2 = 3;
                MVR mvr = new MVR(obj4, obj5, str2, interfaceC23621Ds, i2);
                mvr.A02 = obj;
                return mvr;
            case 4:
                obj6 = this.A03;
                str3 = this.A05;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 4;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 5:
                obj3 = this.A01;
                obj2 = this.A03;
                str = this.A05;
                i = 5;
                return new MVR(obj2, obj3, str, interfaceC23621Ds, i);
            case 6:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A05;
                i = 6;
                return new MVR(obj2, obj3, str, interfaceC23621Ds, i);
            case 7:
                obj7 = this.A02;
                obj8 = this.A01;
                obj6 = this.A03;
                str3 = this.A05;
                i3 = 7;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 8:
                obj6 = this.A03;
                obj7 = this.A02;
                str3 = this.A05;
                obj8 = this.A01;
                i3 = 8;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 9:
                obj6 = this.A03;
                str3 = this.A05;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 9;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 10:
                obj8 = this.A01;
                str3 = this.A05;
                obj6 = this.A03;
                obj7 = this.A02;
                i3 = 10;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 11:
                MVR mvr2 = new MVR(this.A03, this.A05, interfaceC23621Ds, 11);
                mvr2.A01 = obj;
                return mvr2;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj7 = this.A02;
                obj8 = this.A01;
                obj6 = this.A03;
                str3 = this.A05;
                i3 = 12;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj4 = this.A03;
                obj5 = this.A01;
                str2 = this.A05;
                i2 = 13;
                MVR mvr3 = new MVR(obj4, obj5, str2, interfaceC23621Ds, i2);
                mvr3.A02 = obj;
                return mvr3;
            case 14:
                MVO mvo = (MVO) this.A03;
                return new MVR((C07T) this.A02, (C120985dq) this.A01, mvo, this.A05, interfaceC23621Ds, this.A00);
            case Process.SIGTERM /* 15 */:
                obj7 = this.A02;
                obj6 = this.A03;
                obj8 = this.A01;
                str3 = this.A05;
                i3 = 15;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 16:
                obj6 = this.A03;
                str3 = this.A05;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 16;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 17:
                obj6 = this.A03;
                str3 = this.A05;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 17;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 18:
                obj6 = this.A03;
                str3 = this.A05;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 18;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case Process.SIGSTOP /* 19 */:
                obj4 = this.A03;
                str2 = this.A05;
                obj5 = this.A01;
                i2 = 19;
                MVR mvr32 = new MVR(obj4, obj5, str2, interfaceC23621Ds, i2);
                mvr32.A02 = obj;
                return mvr32;
            case 20:
                obj6 = this.A03;
                obj8 = this.A01;
                str3 = this.A05;
                obj7 = this.A02;
                i3 = 20;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 21:
                obj2 = this.A03;
                str = this.A05;
                obj3 = this.A01;
                i = 21;
                return new MVR(obj2, obj3, str, interfaceC23621Ds, i);
            case 22:
                obj6 = this.A03;
                obj7 = this.A02;
                obj8 = this.A01;
                str3 = this.A05;
                i3 = 22;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 23:
                return new MVR(this.A03, this.A05, interfaceC23621Ds, 23);
            case 24:
                obj6 = this.A03;
                obj7 = this.A02;
                str3 = this.A05;
                obj8 = this.A01;
                i3 = 24;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 25:
                obj6 = this.A03;
                obj8 = this.A01;
                obj7 = this.A02;
                str3 = this.A05;
                i3 = 25;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            case 26:
                String str4 = this.A05;
                return new MVR((Context) this.A01, (UserSession) this.A02, str4, interfaceC23621Ds);
            case 27:
                str3 = this.A05;
                obj6 = this.A03;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 27;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
            default:
                obj6 = this.A03;
                str3 = this.A05;
                obj8 = this.A01;
                obj7 = this.A02;
                i3 = 28;
                return new MVR(obj8, obj6, obj7, str3, interfaceC23621Ds, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:645:0x0e3c, code lost:
    
        if (X.AbstractC166987dD.A1a(r4) == false) goto L622;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0f71 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0d8c  */
    /* JADX WARN: Type inference failed for: r3v82, types: [com.instagram.model.direct.DirectSearchMetaAIResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [X.2bZ] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 4120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static void A00(NMF nmf, int i) {
        nmf.A01(Integer.valueOf(i));
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MVR) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MVR(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A05 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MVR(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MVR(C07T c07t, C120985dq c120985dq, MVO mvo, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = 14;
        this.A03 = mvo;
        this.A01 = c120985dq;
        this.A05 = str;
        this.A00 = i;
        this.A02 = c07t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MVR(Object obj, Object obj2, Object obj3, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
        this.A05 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
