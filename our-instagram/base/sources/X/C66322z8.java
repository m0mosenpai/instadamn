package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.MarkerEditor;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* renamed from: X.2z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66322z8 {
    public final C2z9 A00 = new C2z9();
    public final List A01;

    public final C5OL A00(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
        C14360o3.A0B(interfaceC94534Ng, 0);
        C49L c49l = c49i.A02;
        String str = null;
        try {
            for (InterfaceC66172yt interfaceC66172yt : this.A01) {
                str = interfaceC66172yt.FE2();
                if (str != null) {
                    C2z9 c2z9 = this.A00;
                    String str2 = ((C94524Nf) interfaceC94534Ng).A01.A0D;
                    MarkerEditor withMarker = c2z9.A00.withMarker(716778457, 0);
                    C14360o3.A0A(withMarker);
                    C54902fo c54902fo = c2z9.A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append("waterfall_");
                    sb.append(str);
                    sb.append('_');
                    sb.append(str2);
                    sb.append("_start");
                    withMarker.point(c54902fo.A00(sb.toString(), false, false));
                    withMarker.annotate("promotion_id", str2);
                    withMarker.markerEditingCompleted();
                }
                C5OL ABz = interfaceC66172yt.ABz(interfaceC94534Ng, c49i);
                if (ABz.A07) {
                    if (str != null) {
                        c49l.A00(ABz.A00, ((C94524Nf) interfaceC94534Ng).A01.A0D, str, true);
                    }
                    if (!ABz.A06) {
                        if (str != null) {
                            C2z9 c2z92 = this.A00;
                            String str3 = ((C94524Nf) interfaceC94534Ng).A01.A0D;
                            MarkerEditor withMarker2 = c2z92.A00.withMarker(716778457, 0);
                            C14360o3.A0A(withMarker2);
                            C54902fo c54902fo2 = c2z92.A01;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("waterfall_");
                            sb2.append(str);
                            sb2.append('_');
                            sb2.append(str3);
                            sb2.append("_end");
                            withMarker2.point(c54902fo2.A00(sb2.toString(), false, false));
                            withMarker2.annotate("promotion_id", str3);
                            withMarker2.markerEditingCompleted();
                        }
                    } else {
                        return ABz;
                    }
                } else {
                    if (str != null) {
                        C4NJ c4nj = ((C94524Nf) interfaceC94534Ng).A01;
                        c49l.A00(ABz.A00, c4nj.A0D, str, false);
                        C2z9 c2z93 = this.A00;
                        String str4 = c4nj.A0D;
                        MarkerEditor withMarker3 = c2z93.A00.withMarker(716778457, 0);
                        C14360o3.A0A(withMarker3);
                        C54902fo c54902fo3 = c2z93.A01;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("waterfall_");
                        sb3.append(str);
                        sb3.append('_');
                        sb3.append(str4);
                        sb3.append("_fail");
                        withMarker3.point(c54902fo3.A00(sb3.toString(), false, false));
                        withMarker3.annotate("promotion_id", str4);
                        withMarker3.markerEditingCompleted();
                        return ABz;
                    }
                    return ABz;
                }
            }
            return C5OK.A00();
        } catch (Exception e) {
            if (str != null) {
                String str5 = ((C94524Nf) interfaceC94534Ng).A01.A0D;
                String message = e.getMessage();
                if (message == null) {
                    message = "[null]";
                }
                C25531Mh c25531Mh = (C25531Mh) c49l.A01.invoke(c49l.A00);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    c25531Mh.A0Q("promotion_id", Long.valueOf(Long.parseLong(str5)));
                    c25531Mh.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
                    c25531Mh.A0R("eligibility_result", "Fail");
                    ImmutableMap of = ImmutableMap.of((Object) "exception", (Object) message);
                    C14360o3.A07(of);
                    if (!of.isEmpty()) {
                        c25531Mh.A0w(of);
                    }
                    c25531Mh.Cht();
                }
            }
            return new C5OL(null, null, null, null, e.getMessage(), e, false, false, false);
        }
    }

    public C66322z8(List list) {
        this.A01 = list;
    }
}
