package X;

import android.content.Context;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.4KO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4KO {
    public static Boolean A01;
    public static boolean A02;
    public static final C4KP A03 = new InterfaceC12870lZ() { // from class: X.4KP
        @Override // X.InterfaceC12870lZ
        public final void onAppBackgrounded() {
            int A032 = C0f9.A03(1313658275);
            C4KO.A01 = true;
            C0f9.A0A(78715497, A032);
        }

        @Override // X.InterfaceC12870lZ
        public final void onAppForegrounded() {
            int A032 = C0f9.A03(-1028069736);
            C4KO.A01 = false;
            C0f9.A0A(1729300432, A032);
        }
    };
    public final C006802i A00;

    public C4KO(C006802i c006802i) {
        this.A00 = c006802i;
        if (!A02) {
            C218914p.A03(EnumC220415e.A03, A03);
            A02 = true;
        }
    }

    public final AnonymousClass776 A01(UserSession userSession, Boolean bool, Boolean bool2, Long l, int i, boolean z, boolean z2, boolean z3) {
        String str;
        int A06 = AbstractC50712Us.A01.A06(1, Integer.MAX_VALUE);
        C006802i c006802i = this.A00;
        c006802i.markerStart(i, A06, z3);
        MarkerEditor withMarker = c006802i.withMarker(i, A06);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        withMarker.annotate("network_connected_when_attempt", AbstractC15820qc.A0F(context));
        withMarker.annotate("is_tlc_user", z);
        withMarker.annotate("is_ttlc_user", z2);
        if (bool != null) {
            withMarker.annotate("is_dm", bool.booleanValue());
        }
        if (bool2 != null) {
            withMarker.annotate("is_vm", bool2.booleanValue());
        }
        if (l != null) {
            withMarker.annotate("seq_id", l.longValue());
        }
        if (AbstractC94034Kn.A00(userSession)) {
            str = "foreground";
        } else {
            str = AppStateModule.APP_STATE_BACKGROUND;
        }
        withMarker.annotate("account_session_state_at_start", str);
        Boolean bool3 = A01;
        if (bool3 != null) {
            withMarker.annotate("is_app_backgrounded", bool3.booleanValue());
        }
        withMarker.markerEditingCompleted();
        return new AnonymousClass776(i, A06);
    }

    public final void A07(AnonymousClass776 anonymousClass776, String str) {
        C14360o3.A0B(str, 1);
        if (anonymousClass776 != null) {
            this.A00.withMarker(anonymousClass776.A01, anonymousClass776.A00).pointEditor(str).markerEditingCompleted();
        }
    }

    public final void A09(AnonymousClass776 anonymousClass776, String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        if (anonymousClass776 != null) {
            MarkerEditor withMarker = this.A00.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            withMarker.annotate(str, str2);
            withMarker.markerEditingCompleted();
        }
    }

    public final void A0A(AnonymousClass776 anonymousClass776, String str, String str2) {
        C14360o3.A0B(str2, 2);
        if (anonymousClass776 != null) {
            C006802i c006802i = this.A00;
            int i = anonymousClass776.A01;
            int i2 = anonymousClass776.A00;
            MarkerEditor withMarker = c006802i.withMarker(i, i2);
            withMarker.annotate(TraceFieldType.ErrorDomain, str);
            withMarker.annotate("error_message", str2);
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            withMarker.annotate("network_connected_when_failure", AbstractC15820qc.A0F(context));
            withMarker.markerEditingCompleted();
            c006802i.markerEnd(i, i2, (short) 3);
        }
    }

    public final void A02(AbstractC115105If abstractC115105If, AnonymousClass776 anonymousClass776) {
        String str;
        String str2;
        String str3;
        String str4;
        if (anonymousClass776 != null) {
            Throwable A012 = abstractC115105If.A01();
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
            String str5 = null;
            if (A012 != null) {
                if (A012 instanceof C53093Ne6) {
                    str = String.valueOf(((C53093Ne6) A012).A00);
                    str3 = "http";
                } else {
                    str3 = DexOptimization.OPT_KEY_CLIENT;
                    str = null;
                }
                str4 = A012.toString();
                str2 = C2Ql.A00(A012);
            } else if (interfaceC40821up != null) {
                String errorCode = interfaceC40821up.getErrorCode();
                str = String.valueOf(interfaceC40821up.getStatusCode());
                str3 = interfaceC40821up.getErrorSource();
                str4 = interfaceC40821up.getErrorMessage();
                str2 = null;
                str5 = errorCode;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            MarkerEditor withMarker = this.A00.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            withMarker.annotate(TraceFieldType.ErrorCode, str5);
            withMarker.annotate("error_response_code", str);
            withMarker.annotate("error_message", str4);
            withMarker.annotate(TraceFieldType.ErrorDomain, str3);
            withMarker.annotate(AbstractC58317Pt9.A00(22), str4);
            withMarker.annotate(MSV.A00(203), str2);
            withMarker.markerEditingCompleted();
        }
    }

    public final void A03(AnonymousClass776 anonymousClass776) {
        if (anonymousClass776 != null) {
            this.A00.markerPoint(anonymousClass776.A01, anonymousClass776.A00, "app_cache_update_end");
        }
    }

    public final void A04(AnonymousClass776 anonymousClass776) {
        if (anonymousClass776 != null) {
            this.A00.markerPoint(anonymousClass776.A01, anonymousClass776.A00, "app_cache_update_start");
        }
    }

    public final void A05(AnonymousClass776 anonymousClass776) {
        if (anonymousClass776 != null) {
            this.A00.markerPoint(anonymousClass776.A01, anonymousClass776.A00, "network_fetch_start");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        if (r8 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.AnonymousClass776 r7, java.lang.Exception r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L37
            int r5 = r7.A01
            int r4 = r7.A00
            if (r9 == 0) goto Ld
            X.02i r0 = r6.A00
            r0.markerPoint(r5, r4, r9)
        Ld:
            java.lang.String r3 = "unknown_exception_for_mailbox_api_invocation"
            if (r8 == 0) goto L17
            java.lang.String r2 = r8.getMessage()
            if (r2 != 0) goto L1a
        L17:
            r2 = r3
            if (r8 == 0) goto L27
        L1a:
            java.lang.Class r0 = r8.getClass()
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.getSimpleName()
            if (r0 == 0) goto L27
            r3 = r0
        L27:
            X.02i r1 = r6.A00
            java.lang.String r0 = "error_domain"
            r1.markerAnnotate(r5, r4, r0, r3)
            java.lang.String r0 = "error_message"
            r1.markerAnnotate(r5, r4, r0, r2)
            r0 = 3
            r1.markerEnd(r5, r4, r0)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4KO.A06(X.776, java.lang.Exception, java.lang.String):void");
    }

    public final void A08(AnonymousClass776 anonymousClass776, String str, int i) {
        if (anonymousClass776 != null) {
            MarkerEditor withMarker = this.A00.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            withMarker.annotate(str, i);
            withMarker.markerEditingCompleted();
        }
    }

    public final void A0B(AnonymousClass776 anonymousClass776, String str, boolean z) {
        if (anonymousClass776 != null) {
            MarkerEditor withMarker = this.A00.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            withMarker.annotate(str, z);
            withMarker.markerEditingCompleted();
        }
    }

    public void A0C(AnonymousClass776 anonymousClass776) {
        if (anonymousClass776 != null) {
            this.A00.markerEnd(anonymousClass776.A01, anonymousClass776.A00, (short) 2);
        }
    }

    public void A0D(AnonymousClass776 anonymousClass776, Boolean bool, boolean z) {
        if (anonymousClass776 != null) {
            C006802i c006802i = this.A00;
            int i = anonymousClass776.A01;
            int i2 = anonymousClass776.A00;
            MarkerEditor withMarker = c006802i.withMarker(i, i2);
            withMarker.annotate("is_temp_failure", z);
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            withMarker.annotate("network_connected_when_failure", AbstractC15820qc.A0F(context));
            if (bool != null) {
                withMarker.annotate("cancel_exp_backoff", bool.booleanValue());
            }
            withMarker.markerEditingCompleted();
            c006802i.markerEnd(i, i2, (short) 3);
        }
    }
}
