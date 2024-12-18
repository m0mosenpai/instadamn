package X;

import android.net.Uri;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.WZj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70502WZj implements XE8 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C54993OUc A03;
    public final C69734VuU A04;
    public final OVd A05;
    public final String A06;

    @Override // X.XE8
    public final void EN9(C68232VIs c68232VIs, XCB xcb) {
        if (this.A00) {
            Map emptyMap = Collections.emptyMap();
            C14360o3.A07(emptyMap);
            xcb.D6j("", 0, emptyMap);
        } else {
            try {
                A00(xcb, "cancel", AbstractC06930Yk.A0E());
            } catch (JSONException e) {
                Map emptyMap2 = Collections.emptyMap();
                C14360o3.A07(emptyMap2);
                xcb.DGA(e, emptyMap2, 0, false);
            }
        }
    }

    @Override // X.XE8
    public final void ENL(C68232VIs c68232VIs, XCB xcb) {
        if (this.A01) {
            Map emptyMap = Collections.emptyMap();
            C14360o3.A07(emptyMap);
            xcb.D6j("", 0, emptyMap);
        } else {
            try {
                A00(xcb, "end", this.A04.A02(c68232VIs));
            } catch (JSONException e) {
                Map emptyMap2 = Collections.emptyMap();
                C14360o3.A07(emptyMap2);
                xcb.DGA(e, emptyMap2, 0, false);
            }
        }
    }

    private final void A00(XCB xcb, String str, Map map) {
        HashMap hashMap = new HashMap();
        C54993OUc c54993OUc = this.A03;
        hashMap.putAll(c54993OUc.A0B);
        hashMap.putAll(WGX.A01(null, this.A06));
        try {
            hashMap.putAll(map);
            OVd oVd = this.A05;
            Integer num = C05F.A01;
            String str2 = c54993OUc.A09;
            if (str2 == null || str2.length() == 0) {
                str2 = AnonymousClass001.A0R("rupload.", IGPixelRequestBuffer.URL_PREFIX);
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https").encodedAuthority(str2).appendPath(c54993OUc.A03.A01).appendPath(AbstractC166997dE.A0n()).appendQueryParameter("segmented", "true").appendQueryParameter("phase", str);
            String str3 = c54993OUc.A0A;
            if (str3 != null && str3.length() != 0) {
                builder.appendQueryParameter("target", str3);
            }
            oVd.A01(new C66545UMa(xcb), null, num, new java.net.URI(builder.build().toString()), hashMap);
        } catch (RuntimeException | URISyntaxException e) {
            Map emptyMap = Collections.emptyMap();
            C14360o3.A07(emptyMap);
            xcb.DGA(e, emptyMap, 0, false);
        }
    }

    @Override // X.XE8
    public final C69734VuU Bo7() {
        return this.A04;
    }

    @Override // X.XE8
    public final void EOA(W63 w63, C68232VIs c68232VIs, XCB xcb, W62 w62) {
        int i;
        Map emptyMap;
        if (w63 != null) {
            i = w63.A00;
            emptyMap = w63.A0A;
        } else {
            i = 0;
            emptyMap = Collections.emptyMap();
            C14360o3.A07(emptyMap);
        }
        xcb.D6j("", i, emptyMap);
    }

    @Override // X.XE8
    public final void EOS(MYB myb, XCB xcb) {
        if (this.A02) {
            Map emptyMap = Collections.emptyMap();
            C14360o3.A07(emptyMap);
            xcb.D6j("", 0, emptyMap);
            return;
        }
        A00(xcb, "start", this.A04.A01(myb));
    }

    public C70502WZj(C54993OUc c54993OUc, C69734VuU c69734VuU, OVd oVd, String str) {
        this.A03 = c54993OUc;
        this.A04 = c69734VuU;
        this.A05 = oVd;
        this.A06 = str;
    }
}
