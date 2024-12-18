package com.instagram.quickpromotion.debug.devtool;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AnonymousClass001;
import X.C05F;
import X.C117095Rs;
import X.C14360o3;
import X.C1AT;
import X.C1AV;
import X.C23077AFj;
import X.C49G;
import X.C49I;
import X.C4NJ;
import X.C55452gl;
import X.C55732hE;
import X.C5OL;
import X.C5OS;
import X.C66252z1;
import X.C94524Nf;
import X.C94544Nh;
import X.C9EO;
import X.InterfaceC09390do;
import X.InterfaceC19630xq;
import X.InterfaceC55722hD;
import X.InterfaceC94534Ng;
import X.MSV;
import X.SharedPreferencesC19650xs;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* loaded from: classes2.dex */
public final class IGDevToolPersistentStateHandler implements InterfaceC55722hD {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public IGDevToolPersistentStateHandler(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = AbstractC09440dt.A01(new C9EO(this, 3));
    }

    @Override // X.InterfaceC55722hD
    public final void AHg(InterfaceC94534Ng interfaceC94534Ng, Integer num, String str) {
        Integer num2;
        Integer num3;
        Integer num4;
        C14360o3.A0B(interfaceC94534Ng, 0);
        C14360o3.A0B(num, 1);
        UserSession userSession = this.A01;
        C49G c49g = new C49G(new SharedPreferencesC19650xs(C1AT.A01(userSession).A03(C1AV.A2d)), userSession.userId, str);
        String str2 = ((C94524Nf) interfaceC94534Ng).A01.A0D;
        int intValue = num.intValue();
        if (intValue != 0) {
            num4 = null;
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 4 && intValue != 3) {
                        throw new RuntimeException();
                    }
                    num2 = C05F.A1F;
                    num3 = C05F.A1I;
                    num4 = C05F.A01;
                } else {
                    num2 = C05F.A0u;
                    num3 = C05F.A15;
                }
            } else {
                num2 = C05F.A0Y;
                num3 = C05F.A0j;
            }
        } else {
            num2 = C05F.A0C;
            num3 = C05F.A0N;
            num4 = C05F.A00;
        }
        String A00 = C49G.A00(c49g, num2, str2);
        String A002 = C49G.A00(c49g, num3, str2);
        SharedPreferences.Editor edit = c49g.A00.edit();
        edit.remove(A00).remove(A002);
        if (num4 != null) {
            edit.remove(AnonymousClass001.A0T(c49g.A03, AnonymousClass001.A0T(c49g.A02, C5OS.A00(num4), '/'), '/'));
        }
        edit.apply();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.2z0] */
    @Override // X.InterfaceC55722hD
    public final C5OL AYa(InterfaceC94534Ng interfaceC94534Ng, String str) {
        ?? obj = new Object();
        C55452gl c55452gl = (C55452gl) C55452gl.A02.getValue();
        C4NJ c4nj = ((C94524Nf) interfaceC94534Ng).A01;
        Set CB6 = c4nj.CB6();
        C49I A00 = c55452gl.A00(this.A00, this.A01, new C55732hE(), String.valueOf(c4nj.A06.A00), CB6);
        C14360o3.A0C(A00, MSV.A00(527));
        return obj.ABz(interfaceC94534Ng, A00);
    }

    @Override // X.InterfaceC55722hD
    public final C5OL ArV(InterfaceC94534Ng interfaceC94534Ng, String str) {
        C66252z1 c66252z1 = new C66252z1();
        C55452gl c55452gl = (C55452gl) C55452gl.A02.getValue();
        C4NJ c4nj = ((C94524Nf) interfaceC94534Ng).A01;
        Set CB6 = c4nj.CB6();
        C49I A00 = c55452gl.A00(this.A00, this.A01, new C55732hE(), String.valueOf(c4nj.A06.A00), CB6);
        C14360o3.A0C(A00, MSV.A00(527));
        return c66252z1.ABz(interfaceC94534Ng, A00);
    }

    @Override // X.InterfaceC55722hD
    public final int As0(InterfaceC94534Ng interfaceC94534Ng, Integer num, String str) {
        Integer num2;
        UserSession userSession = this.A01;
        C49G c49g = new C49G(new SharedPreferencesC19650xs(C1AT.A01(userSession).A03(C1AV.A2d)), userSession.userId, str);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    num2 = C05F.A0N;
                } else {
                    num2 = C05F.A0C;
                }
            } else {
                num2 = C05F.A01;
            }
        } else {
            num2 = C05F.A00;
        }
        return c49g.A03(num2, ((C94524Nf) interfaceC94534Ng).A01.A0D);
    }

    @Override // X.InterfaceC55722hD
    public final int B7q(String str) {
        return ((InterfaceC19630xq) this.A02.getValue()).getInt(AnonymousClass001.A0R(AbstractC111324zv.A00(1471), Uri.encode(str)), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper, java.lang.Object] */
    @Override // X.InterfaceC55722hD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CEN(java.lang.String r12, java.util.Map r13, X.InterfaceC23621Ds r14) {
        /*
            r11 = this;
            r5 = 1
            boolean r0 = X.PXD.A03(r14, r5)
            if (r0 == 0) goto L4e
            r4 = r14
            X.PXD r4 = (X.PXD) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            if (r1 == 0) goto L28
            if (r1 != r5) goto L56
            X.AbstractC09560e7.A00(r0)
        L22:
            r3 = r0
            if (r0 != 0) goto L27
            X.0sl r3 = X.C16930sl.A00
        L27:
            return r3
        L28:
            X.AbstractC09560e7.A00(r0)
            com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r8 = new com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper
            r8.<init>()
            android.content.Context r6 = r11.A00
            com.instagram.common.session.UserSession r7 = r11.A01
            r4.A00 = r5
            X.12L r2 = X.C12L.A00
            r10 = 0
            r1 = 700377912(0x29beeb38, float:8.478499E-14)
            r0 = 3
            X.0nZ r0 = r2.CPG(r1, r0)
            X.PYq r5 = new X.PYq
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r4, r0, r5)
            if (r0 != r3) goto L22
            return r3
        L4e:
            r0 = 42
            X.PXD r4 = new X.PXD
            r4.<init>(r11, r14, r5, r0)
            goto L15
        L56:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler.CEN(java.lang.String, java.util.Map, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC55722hD
    public final String Aqr(InterfaceC94534Ng interfaceC94534Ng) {
        C117095Rs c117095Rs;
        String str;
        C94544Nh c94544Nh = ((C94524Nf) interfaceC94534Ng).A03;
        if (c94544Nh == null || (c117095Rs = c94544Nh.A00.A03) == null || (str = c117095Rs.A00) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC55722hD
    public final String C8t(InterfaceC94534Ng interfaceC94534Ng) {
        String str;
        C94544Nh c94544Nh = ((C94524Nf) interfaceC94534Ng).A03;
        if (c94544Nh == null || (str = c94544Nh.A00.A09.A00) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC55722hD
    public final String B7s(String str) {
        switch (C23077AFj.A00[B7q(str)].intValue()) {
            case 1:
                return "(Forced On)";
            case 2:
                return "(Forced Off)";
            case 3:
                return "(Ignore Enable Time)";
            default:
                return "(Default)";
        }
    }
}
