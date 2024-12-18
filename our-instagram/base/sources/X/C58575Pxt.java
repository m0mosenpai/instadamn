package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Pxt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58575Pxt implements C2JL {
    public final C120985dq A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C38321qM c38321qM;
        C120985dq c120985dq = this.A00;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            c38321qM.A0c.A08 = false;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2JS A0k;
        ImmutableList requiredCompactedTreeListField;
        ImmutableList immutableList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        InterfaceC16820sZ interfaceC16820sZ;
        C38321qM c38321qM;
        C2JS optionalTreeField;
        C2JS optionalTreeField2;
        C2JS A04;
        C2JS A042;
        C2JS optionalTreeField3;
        C2JS A02;
        C2JS optionalTreeField4;
        C2JS optionalTreeField5;
        C2JS optionalTreeField6;
        C2JS optionalTreeField7;
        C2JS optionalTreeField8;
        C38321qM c38321qM2;
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        C120985dq c120985dq = this.A00;
        if (c120985dq != null && (c38321qM2 = c120985dq.A02) != null) {
            c38321qM2.A0c.A08 = false;
        }
        String str8 = null;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (requiredCompactedTreeListField = A0k.getRequiredCompactedTreeListField(0, "xfb_aymt_instagram_graphql_channel_tip(input:$input)", Qj8.class, -1715174050)) != null && !requiredCompactedTreeListField.isEmpty()) {
            C2JS A0N = MSW.A0N(requiredCompactedTreeListField, 0);
            if (A0N != null) {
                immutableList = A0N.getRequiredCompactedTreeListField(5, "specs", Qj7.class, -985398079);
            } else {
                immutableList = null;
            }
            C2JS A0N2 = MSW.A0N(requiredCompactedTreeListField, 0);
            if (A0N2 != null && (optionalTreeField7 = A0N2.getOptionalTreeField(4, "event_metadata", C59636Qj0.class, -1885460272)) != null && (optionalTreeField8 = optionalTreeField7.getOptionalTreeField(0, "logging_meta_data", C59635Qiz.class, -133124398)) != null) {
                str = optionalTreeField8.getOptionalStringField(0, "tip_stage");
            } else {
                str = null;
            }
            C2JS A0N3 = MSW.A0N(requiredCompactedTreeListField, 0);
            if (A0N3 != null && (optionalTreeField5 = A0N3.getOptionalTreeField(4, "event_metadata", C59636Qj0.class, -1885460272)) != null && (optionalTreeField6 = optionalTreeField5.getOptionalTreeField(0, "logging_meta_data", C59635Qiz.class, -133124398)) != null) {
                str2 = optionalTreeField6.A08("metric_name");
            } else {
                str2 = null;
            }
            C2JS A0N4 = MSW.A0N(requiredCompactedTreeListField, 0);
            if (A0N4 != null) {
                str3 = A0N4.getOptionalStringField(0, "tip_id");
            } else {
                str3 = null;
            }
            C2JS A0N5 = MSW.A0N(requiredCompactedTreeListField, 0);
            if (A0N5 != null) {
                str4 = A0N5.A0A("channel_id");
            } else {
                str4 = null;
            }
            if (immutableList != null && !immutableList.isEmpty()) {
                C2JS A0N6 = MSW.A0N(immutableList, 0);
                if (A0N6 != null && (A02 = A0N6.A02(Qj6.class, DialogModule.KEY_TITLE, -107419088)) != null && (optionalTreeField4 = A02.getOptionalTreeField(0, "text", Qj5.class, -288131805)) != null) {
                    str5 = optionalTreeField4.getOptionalStringField(0, "text");
                } else {
                    str5 = null;
                }
                C2JS A0N7 = MSW.A0N(immutableList, 0);
                if (A0N7 != null && (A042 = A0N7.A04(Qj2.class, "action", -1010586163)) != null && (optionalTreeField3 = A042.getOptionalTreeField(0, "text(aymt_action_key:\"PRIMARY\")", Qj1.class, -492808006)) != null) {
                    str6 = AbstractC58318PtA.A0h(optionalTreeField3);
                } else {
                    str6 = null;
                }
                C2JS A0N8 = MSW.A0N(immutableList, 0);
                if (A0N8 != null && (A04 = A0N8.A04(Qj2.class, "action", -1010586163)) != null) {
                    str7 = A04.A08("link(aymt_action_key:\"PRIMARY\")");
                } else {
                    str7 = null;
                }
                C2JS A0N9 = MSW.A0N(immutableList, 0);
                if (A0N9 != null && (optionalTreeField = A0N9.getOptionalTreeField(0, "image", Qj4.class, -1842743307)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "primary_cta_icon", Qj3.class, -1860563462)) != null) {
                    str8 = optionalTreeField2.getOptionalStringField(0, "uri");
                }
                if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
                    C40031tU c40031tU = c38321qM.A0c;
                    c40031tU.A07 = str5;
                    c40031tU.A04 = str6;
                    c40031tU.A01 = str7;
                    c40031tU.A06 = str;
                    c40031tU.A03 = str2;
                    c40031tU.A05 = str3;
                    c40031tU.A00 = str4;
                    c40031tU.A02 = str8;
                    c40031tU.A09 = true;
                }
                if (C14360o3.A0K(MSW.A0N(requiredCompactedTreeListField, 0).A08("tip_name"), "instagram_insights_reels_golden_window_tip")) {
                    interfaceC16820sZ = this.A02;
                } else {
                    interfaceC16820sZ = this.A01;
                }
                interfaceC16820sZ.invoke();
            }
        }
    }

    public C58575Pxt(C120985dq c120985dq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A00 = c120985dq;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }
}
