package X;

import com.instagram.api.schemas.UrpIndexAction;
import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public abstract class IPT {
    public static C114625Fm parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UrpIndexAction urpIndexAction = null;
            C114615Fj c114615Fj = null;
            String str = null;
            Integer num = null;
            C38807H6x c38807H6x = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    urpIndexAction = (UrpIndexAction) UrpIndexAction.A01.get(A1P);
                    if (urpIndexAction == null) {
                        urpIndexAction = UrpIndexAction.A08;
                    }
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0s)) {
                    c114615Fj = AbstractC41281IOw.parseFromJson(c16l);
                } else if ("client_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("media_composition".equals(A0s)) {
                    c38807H6x = AbstractC40431HwM.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C114625Fm(c114615Fj, urpIndexAction, c38807H6x, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C114625Fm c114625Fm) {
        anonymousClass182.A0d();
        UrpIndexAction urpIndexAction = c114625Fm.A01;
        if (urpIndexAction != null) {
            anonymousClass182.A0S("action", urpIndexAction.A00);
        }
        C114615Fj c114615Fj = c114625Fm.A00;
        if (c114615Fj != null) {
            anonymousClass182.A0r(MediaStreamTrack.AUDIO_TRACK_KIND);
            AbstractC41281IOw.A00(anonymousClass182, c114615Fj);
        }
        String str = c114625Fm.A04;
        if (str != null) {
            anonymousClass182.A0S("client_name", str);
        }
        Integer num = c114625Fm.A03;
        if (num != null) {
            anonymousClass182.A0Q("index", num.intValue());
        }
        C38807H6x c38807H6x = c114625Fm.A02;
        if (c38807H6x != null) {
            anonymousClass182.A0r("media_composition");
            anonymousClass182.A0d();
            List list = c38807H6x.A04;
            if (list != null) {
                Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "asset_infos", list);
                while (A0q.hasNext()) {
                    IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo = (IgShowreelCompositionAssetInfo) A0q.next();
                    if (igShowreelCompositionAssetInfo != null) {
                        AbstractC105414p7.A00(anonymousClass182, igShowreelCompositionAssetInfo);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str2 = c38807H6x.A01;
            if (str2 != null) {
                anonymousClass182.A0S("logging_info", str2);
            }
            UrpRendererType urpRendererType = c38807H6x.A00;
            if (urpRendererType != null) {
                anonymousClass182.A0S("renderer_type", urpRendererType.A00);
            }
            String str3 = c38807H6x.A02;
            if (str3 != null) {
                anonymousClass182.A0S("rendering_spec", str3);
            }
            String str4 = c38807H6x.A03;
            if (str4 != null) {
                anonymousClass182.A0S("template_id", str4);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
