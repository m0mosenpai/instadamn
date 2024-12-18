package X;

import com.google.common.collect.ImmutableList;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.venue.LocationDict;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.6ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148286ly {
    public float A02;
    public float A03;
    public float A05;
    public float A06;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0F;
    public AvatarInfo A0G;
    public ImageUrl A0H;
    public C148286ly A0I;
    public HashtagImpl A0J;
    public LocationDict A0K;
    public Boolean A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0Y;
    public String A0Z;
    public String A0c;
    public String A0d;
    public String A0g;
    public String A0h;
    public String A0i;
    public List A0k;
    public List A0m;
    public List A0n;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public float A07 = 1.0f;
    public String A0f = "#ffffff";
    public String A0e = "#ffffff";
    public float A04 = 0.3f;
    public List A0l = new ArrayList();
    public String A0X = "";
    public String A0R = "";
    public List A0j = Collections.emptyList();
    public String A0a = "";
    public String A0b = "";
    public final List A0o = new ArrayList();
    public int A0E = -1;
    public int A0D = -1;
    public int A0C = 0;

    public static C148286ly A00(ImageUrl imageUrl, String str, String str2, float f, float f2, float f3) {
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = str;
        c148286ly.A0U = str2;
        c148286ly.A0H = imageUrl;
        c148286ly.A01 = f;
        c148286ly.A00 = f2;
        c148286ly.A02 = f3;
        c148286ly.A09 = 0;
        return c148286ly;
    }

    public final ImmutableList A02() {
        List list = this.A0k;
        if (list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return null;
    }

    public final ImmutableList A03() {
        List list = this.A0l;
        if (list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return null;
    }

    public final Integer A04() {
        String str = this.A0h;
        if ("text".equals(str)) {
            return C05F.A0C;
        }
        if (!"image_text".equals(str) && !MediaStreamTrack.VIDEO_TRACK_KIND.equals(str)) {
            if ("animation".equals(str)) {
                return C05F.A0N;
            }
            return C05F.A00;
        }
        return C05F.A01;
    }

    public final float A01() {
        if (A04() == C05F.A0C && this.A02 == 0.0f) {
            return 0.3f;
        }
        return this.A02;
    }

    public final void A05(List list) {
        ArrayList A00 = AbstractC92144Au.A00(list);
        A00.removeAll(Collections.singleton(null));
        this.A0l = A00;
    }
}
