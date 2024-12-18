package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.GFf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36685GFf implements InterfaceC169507hQ, GZD {
    public InterfaceC169357h9 A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final Context A04;
    public final Bundle A05;
    public final View A06;
    public final AbstractC018607g A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final IgdsInlineSearchBox A0A;
    public final EQ6 A0B;
    public final Integer A0C;

    public C36685GFf(Context context, Bundle bundle, View view, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EQ6 eq6, IgdsInlineSearchBox igdsInlineSearchBox, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A04 = context;
        this.A09 = userSession;
        this.A08 = interfaceC11380iw;
        this.A07 = abstractC018607g;
        this.A0A = igdsInlineSearchBox;
        this.A06 = view;
        this.A0B = eq6;
        this.A0C = num;
        this.A05 = bundle;
        igdsInlineSearchBox.A02 = this;
        boolean z = bundle.getBoolean("DirectShareSheetConstants.meta_ai_agent_target_enabled");
        boolean z2 = bundle.getBoolean("DirectShareSheetConstants.msys_recipients_only");
        boolean z3 = bundle.getBoolean("DirectShareSheetConstants.include_msys_threads");
        UserSession userSession2 = this.A09;
        Context context2 = this.A04;
        InterfaceC169357h9 A01 = AbstractC31674Dvf.A01(context2, null, userSession2, new C61972ry(context2, this.A07, null), null, null, "reshare", "reshare_share_sheet", "direct_user_search_keypressed", null, null, null, 0, 0, 0, z ? 1 : 0, true, z3, z2, true, false, false, false, false, false, false);
        this.A00 = A01;
        A01.EYJ(this);
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            interfaceC169357h9.Eby("");
        } else {
            C14360o3.A0F("searchProvider");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
    
        if (r0.A06.A0A(r7, r0.A05) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    @Override // X.InterfaceC169507hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DcI(X.InterfaceC169517hR r15) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36685GFf.DcI(X.7hR):void");
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC169357h9 interfaceC169357h9 = this.A00;
        if (interfaceC169357h9 != null) {
            interfaceC169357h9.Eby(str);
            int length = str.length();
            this.A03 = AbstractC167007dF.A1O(length);
            if (this.A0C == C05F.A00) {
                UserSession userSession = this.A09;
                if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328409642581497L)) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A08, userSession), "share_sheet_search_query_changed");
                    if (A0f.isSampled()) {
                        String str2 = this.A01;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        A0f.AAP("query_session_id", str2);
                        String str4 = this.A02;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        A0f.AAP("sub_query_session_id", str3);
                        A0f.AAP("query_string", str);
                        AbstractC31175DnJ.A11(A0f, length);
                        A0f.Cht();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0F("searchProvider");
        throw C00O.createAndThrow();
    }
}
