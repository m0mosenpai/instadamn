package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Z8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z8 {
    public static C1Z8 A04;
    public BCJ A00;
    public Xi7 A01;
    public C131205w8 A02;
    public final Map A03 = new LinkedHashMap();

    public final C69662Vt3 A01(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, Integer num, String str, String str2, String str3) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(num, 5);
        return new C69662Vt3(fragmentActivity, c22p, A00(userSession), userSession, num, str, str2, str3);
    }

    public final C23656Adr A02(Context context, VEL vel, C68709Val c68709Val, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        Map map = this.A03;
        if (!map.containsKey(vel)) {
            map.put(vel, new C23656Adr(context, vel, c68709Val, userSession, str));
        }
        return (C23656Adr) AbstractC09990gB.A0I(vel, map);
    }

    public final void A03(UserSession userSession, Activity activity, String str) {
        C14360o3.A0B(userSession, 1);
        C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A0M, str, false);
        c63397SjR.A0E(userSession.userId);
        c63397SjR.A0S = "ar_ads_camera";
        c63397SjR.A0A();
        C71313Hs A00 = C71313Hs.A00(userSession);
        C14360o3.A07(A00);
        View requireViewById = activity.requireViewById(R.id.arads_camera_container);
        C14360o3.A07(requireViewById);
        A00.A0B(requireViewById, new String[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5w6] */
    public final C131205w8 A00(UserSession userSession) {
        C131205w8 c131205w8 = this.A02;
        if (c131205w8 == null) {
            final C131175w5 c131175w5 = new C131175w5(userSession);
            C131205w8 c131205w82 = new C131205w8(new InterfaceC131195w7(c131175w5) { // from class: X.5w6
                public final C131175w5 A00;

                @Override // X.InterfaceC131195w7
                public final /* bridge */ /* synthetic */ Object AUr(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
                    String str = (String) obj;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C89563yw.A01;
                    C89563yw c89563yw = new C89563yw(C1E2.A02(interfaceC23621Ds));
                    C131175w5 c131175w52 = this.A00;
                    SCF scf = new SCF(c89563yw);
                    C14360o3.A0B(str, 0);
                    C2JM c2jm = new C2JM();
                    c2jm.A04("encoded_token", str);
                    UserSession userSession2 = c131175w52.A00;
                    Map A03 = C56A.A03(AbstractC12290kX.A00, new AnonymousClass569(userSession2), AnonymousClass567.A00());
                    C14360o3.A07(A03);
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    for (String str2 : A03.keySet()) {
                        C2JO c2jo = new C2JO();
                        c2jo.A09(str2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        c2jo.A09(String.valueOf(A03.get(str2)), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        builder.add((Object) c2jo);
                    }
                    ImmutableList build = builder.build();
                    C14360o3.A07(build);
                    c2jm.A05("effects_supported_capabilities", build);
                    C907442n c907442n = new C907442n(c2jm, C9Z2.class, "InstagramARAdsContextQuery", false);
                    C195928le.A00(userSession2).ATV(new C63996SxT(scf), new C64008Sxf(scf), c907442n);
                    return c89563yw.A00();
                }

                {
                    this.A00 = c131175w5;
                }
            });
            this.A02 = c131205w82;
            return c131205w82;
        }
        return c131205w8;
    }
}
