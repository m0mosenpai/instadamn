package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.7Aa, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Aa implements C7Q6 {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final int A02;
    public final InterfaceC165057Zu A03;

    public C7Aa(UserSession userSession, InterfaceC165057Zu interfaceC165057Zu, int i) {
        C14360o3.A0B(interfaceC165057Zu, 2);
        this.A00 = userSession;
        this.A03 = interfaceC165057Zu;
        this.A02 = i;
        this.A01 = AbstractC09440dt.A01(new C9E8(this, 30));
    }

    public final boolean A00(C129535tI c129535tI, C158697Af c158697Af) {
        List list;
        C7B4 c7b4;
        C14360o3.A0B(c129535tI, 0);
        C14360o3.A0B(c158697Af, 1);
        InterfaceC129525tH interfaceC129525tH = ((AbstractC129515tG) c129535tI).A00;
        boolean BCt = interfaceC129525tH.BCt();
        MessageIdentifier BSy = c129535tI.BSy();
        InterfaceC165057Zu interfaceC165057Zu = this.A03;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165057Zu, BSy, BCt)) {
            C7QY c7qy = c129535tI.A03;
            C9C9 c9c9 = c7qy.A08;
            String str = c9c9.A01;
            if (str.length() > 0) {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                AbstractC158787Ap abstractC158787Ap = c129535tI.A05;
                ImageUrl imageUrl = null;
                if (abstractC158787Ap != null && !AbstractC001900j.A0a(str, "reaction=", false) && (abstractC158787Ap instanceof C7B5)) {
                    str = A03.buildUpon().appendQueryParameter("reaction", ((C7B5) abstractC158787Ap).A01).build().toString();
                }
                View A01 = c158697Af.A0D.A01();
                C14360o3.A07(A01);
                GradientSpinner gradientSpinner = (GradientSpinner) A01;
                gradientSpinner.A04();
                AbstractC1583778x abstractC1583778x = c7qy.A0F;
                String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = c7qy.A0V;
                if (str2 != null) {
                    this.A01.getValue();
                    String str3 = c9c9.A00;
                    int layoutPosition = c158697Af.getLayoutPosition();
                    C14360o3.A0B(str3, 0);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(TraceFieldType.ContentType, "ai_bot_reels_plugin");
                    linkedHashMap2.put("agent_id", str3);
                    linkedHashMap2.put("bot_response_id", str2);
                    linkedHashMap2.put("xma_tap_index", String.valueOf(layoutPosition));
                    linkedHashMap.putAll(linkedHashMap2);
                }
                C43749JWk A00 = AbstractC43751JWn.A00(this.A00);
                C38801rC c38801rC = C38321qM.A0h;
                String A06 = C38801rC.A06(queryParameter);
                String str4 = c7qy.A0Y;
                A00.A00 = null;
                String str5 = C2EY.A1r.A00;
                if (C14360o3.A0K(str4, str5)) {
                    C006802i c006802i = A00.A01;
                    c006802i.markerStart(20128369);
                    A00.A00 = A06;
                    boolean z = false;
                    if (A06 != null) {
                        z = true;
                    }
                    c006802i.markerAnnotate(20128369, "tapped media id exist", z);
                    c006802i.markerPoint(20128369, "tapped_reel_in_thread");
                }
                InterfaceC164887Zb interfaceC164887Zb = (InterfaceC164887Zb) interfaceC165057Zu;
                String str6 = c9c9.A00;
                MessageIdentifier BSy2 = c129535tI.BSy();
                Long valueOf = Long.valueOf(interfaceC129525tH.BT8());
                int i = this.A02;
                List singletonList = Collections.singletonList(queryParameter);
                C14360o3.A07(singletonList);
                if (abstractC1583778x != null && (abstractC1583778x instanceof C158737Aj)) {
                    list = Collections.singletonList(((C158737Aj) abstractC1583778x).A00);
                    C14360o3.A07(list);
                } else {
                    list = null;
                }
                List singletonList2 = Collections.singletonList(c7qy.A0N);
                C14360o3.A07(singletonList2);
                E6B e6b = new E6B(AbstractC13880nE.A0G(c158697Af.A0V), 0.0f);
                if ((abstractC158787Ap instanceof C7B4) && (c7b4 = (C7B4) abstractC158787Ap) != null) {
                    imageUrl = c7b4.A00;
                }
                interfaceC164887Zb.Cs7(null, imageUrl, e6b, BSy2, gradientSpinner, valueOf, valueOf, str, str6, c7qy.A0T, c7qy.A0U, str4, null, ((InterfaceC164917Zg) interfaceC165057Zu).C7d(), singletonList, list, singletonList2, null, null, linkedHashMap, i, c7qy.A0m);
                if (C14360o3.A0K(str4, str5)) {
                    A00.A01.markerPoint(20128369, "navigate_to_reels_viewer");
                }
            } else {
                AbstractC158777Ao abstractC158777Ao = c129535tI.A04;
                if (abstractC158777Ao == null) {
                    return false;
                }
                if (abstractC158777Ao instanceof C158817At) {
                    AbstractC27437C9f abstractC27437C9f = ((C158817At) abstractC158777Ao).A01;
                    if (abstractC27437C9f instanceof C27211BzU) {
                        C27211BzU c27211BzU = (C27211BzU) abstractC27437C9f;
                        C14360o3.A0B(c27211BzU, 0);
                        String str7 = c27211BzU.A02;
                        String str8 = c27211BzU.A03;
                        C1NB c1nb = c27211BzU.A00;
                        String str9 = c27211BzU.A01;
                        View A012 = c158697Af.A0D.A01();
                        C14360o3.A07(A012);
                        GradientSpinner gradientSpinner2 = (GradientSpinner) A012;
                        gradientSpinner2.A04();
                        RectF A0G = AbstractC13880nE.A0G(c158697Af.A0V);
                        Resources resources = gradientSpinner2.getResources();
                        C14360o3.A07(resources);
                        interfaceC165057Zu.Crp(A0G, new C47777L8c(resources, gradientSpinner2), c129535tI.BSy(), c1nb, str7, str8, str9, null, c9c9.A00);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid PortraitXmaContentViewModel.NavigationFields: ");
                    sb.append(abstractC27437C9f);
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid PortraitXmaContentViewModel.Content: ");
                sb2.append(abstractC158777Ao);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return true;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        return A00((C129535tI) obj, (C158697Af) obj2);
    }
}
