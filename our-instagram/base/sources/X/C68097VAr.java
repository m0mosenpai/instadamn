package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VAr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68097VAr extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "HashtagRecencyFragment";
    public C70998WmF A00;
    public C68810VcR A01;
    public C189478aR A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_hashtag_recency_filter";
    }

    public static final void A00(C68097VAr c68097VAr, String str) {
        String str2;
        C68810VcR c68810VcR = c68097VAr.A01;
        if (c68810VcR != null) {
            V1R v1r = c68810VcR.A00;
            WG5 wg5 = v1r.A0c;
            C68034V7f c68034V7f = v1r.A08;
            if (c68034V7f == null) {
                str2 = "dataSource";
            } else {
                String obj = c68034V7f.A00.toString();
                C14360o3.A0B(obj, 0);
                WG5.A03(wg5, obj, 20643842);
                v1r.A0O = str;
                V1R.A08(v1r, str, 20643842, true, false);
                V5X[] v5xArr = {new C38124Gpr(EnumC38183Gqo.A0B)};
                C66095TzW c66095TzW = v1r.A06;
                str2 = "adapter";
                if (c66095TzW != null) {
                    c66095TzW.A06 = v5xArr;
                    C66095TzW.A00(c66095TzW);
                    C66095TzW c66095TzW2 = v1r.A06;
                    if (c66095TzW2 != null) {
                        C66095TzW.A00(c66095TzW2);
                        if (C14360o3.A0K(v1r.A0O, "top_recent_posts") && AbstractC23021Ah.A00(V1R.A00(v1r)).A01.getInt(AbstractC111324zv.A00(2446), 0) < 1) {
                            C41451vu c41451vu = C41451vu.A01;
                            C146106i8 c146106i8 = new C146106i8();
                            c146106i8.A0D = AbstractC166997dE.A0N(v1r).getString(2131963460);
                            c146106i8.A02();
                            UserSession A00 = V1R.A00(v1r);
                            C14360o3.A0B(A00, 0);
                            boolean booleanValue = C6PY.A00(A00).booleanValue();
                            int i = R.drawable.instagram_sparkles_filled_16;
                            if (booleanValue) {
                                i = R.drawable.instagram_effects_pano_filled_16;
                            }
                            c146106i8.A07(i);
                            c146106i8.A0A(new G97(v1r, 4));
                            c41451vu.E4s(new C3KD(c146106i8.A00()));
                        }
                        C70998WmF c70998WmF = c68097VAr.A00;
                        if (c70998WmF != null) {
                            c70998WmF.A00 = str;
                            c68097VAr.A03 = str;
                            C189478aR c189478aR = c68097VAr.A02;
                            if (c189478aR != null) {
                                c189478aR.A07();
                                return;
                            }
                            str2 = "bottomSheet";
                        } else {
                            str2 = "holder";
                        }
                    }
                }
            }
        } else {
            str2 = "delegate";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // X.AbstractC33235ElU
    public final boolean isElevated() {
        return C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A04.getValue(), 36326279338866484L);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(343350929);
        super.onCreate(bundle);
        C70998WmF c70998WmF = this.A00;
        if (c70998WmF != null) {
            this.A03 = c70998WmF.A00;
            C0f9.A09(-388192759, A02);
        } else {
            C14360o3.A0F("holder");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        List list;
        int A02 = C0f9.A02(-1351540955);
        super.onResume();
        if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A04.getValue(), 36326279338932021L)) {
            String A0v = AbstractC25227BEk.A0v(this, 2131963459);
            EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
            String str = this.A03;
            if (str != null) {
                C54737OFo c54737OFo = new C54737OFo(null, new WNU(this, 39), null, null, enumC53237Nga, null, null, null, null, null, null, null, A0v, null, null, true, str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
                String A0v2 = AbstractC25227BEk.A0v(this, 2131963453);
                String str2 = this.A03;
                if (str2 != null) {
                    list = AbstractC16960so.A1Q(c54737OFo, new C54737OFo(null, new WNU(this, 40), null, null, enumC53237Nga, null, null, null, null, null, null, null, A0v2, null, null, true, str2.equals("top_recent_posts")));
                    setItems(list);
                    C0f9.A09(-1289229020, A02);
                    return;
                }
            }
            C14360o3.A0F("currentFilterSelection");
            throw C00O.createAndThrow();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C35124FeR.A00(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, getString(2131963459), arrayList2);
        C35124FeR.A00("top_recent_posts", getString(2131963453), arrayList2);
        String str3 = this.A03;
        if (str3 != null) {
            arrayList.add(new C34960Fak(new C35752Fqk(3, this, arrayList2), str3, arrayList2));
            list = arrayList;
            setItems(list);
            C0f9.A09(-1289229020, A02);
            return;
        }
        C14360o3.A0F("currentFilterSelection");
        throw C00O.createAndThrow();
    }
}
