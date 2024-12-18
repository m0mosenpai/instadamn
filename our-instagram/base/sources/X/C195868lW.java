package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8lW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195868lW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public long A0L;
    public long A0M;
    public Bitmap A0N;
    public MediaComposition A0O;
    public CameraAREffect A0P;
    public C185368Kc A0Q;
    public Medium A0R;
    public MediaUploadMetadata A0S;
    public C18160v1 A0T;
    public C18160v1 A0U;
    public MusicOverlayStickerModel A0V;
    public C184758Hq A0W;
    public C195868lW A0X;
    public Boolean A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public List A0t;
    public List A0u;
    public List A0v;
    public List A0w;
    public List A0x;
    public List A0y;
    public List A0z;
    public java.util.Set A10;
    public java.util.Set A11;
    public java.util.Set A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public final Integer A1M;

    public C195868lW(Medium medium, int i, int i2, int i3) {
        C14360o3.A0B(medium, 4);
        this.A0k = "";
        this.A12 = new HashSet();
        this.A00 = 1;
        this.A0S = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A0K = i;
        this.A08 = i2;
        this.A09 = i3;
        this.A0R = medium;
        this.A0k = new File(medium.A0X).getAbsolutePath();
        this.A0U = AbstractC14620oa.A01(medium.A0H, medium.A07);
        this.A0L = medium.A0C * 1000;
        this.A0M = medium.A0D;
        MediaUploadMetadata mediaUploadMetadata = medium.A0G;
        this.A0S = mediaUploadMetadata;
        this.A0e = medium.A0N;
        if (medium.Cff()) {
            this.A07 = medium.A03;
        }
        this.A0F = mediaUploadMetadata.A0B ? 54 : 0;
        this.A18 = true;
        this.A1H = true;
        this.A1M = null;
    }

    public final void A09(int i, List list) {
        List list2;
        C14360o3.A0B(list, 1);
        if (this.A0y == null) {
            this.A0y = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraToolInfo cameraToolInfo = (CameraToolInfo) it.next();
            if (cameraToolInfo != null && (list2 = this.A0y) != null) {
                list2.add(A08.A00(cameraToolInfo, i));
            }
        }
    }

    public final boolean equals(Object obj) {
        MediaComposition mediaComposition;
        if (obj != null && (obj instanceof C195868lW) && ((mediaComposition = this.A0O) == null || mediaComposition.equals(((C195868lW) obj).A0O))) {
            return AbstractC002300n.A0g(A07(), ((C195868lW) obj).A07(), true);
        }
        return false;
    }

    public final long A00() {
        long length = new File(this.A0k).length();
        int i = this.A07;
        if (i == 0) {
            return 0L;
        }
        return (length / i) * 8000;
    }

    public final Rect A01() {
        int i = this.A03;
        if (i == 0 && this.A05 == 0 && this.A04 == 0 && this.A02 == 0) {
            return null;
        }
        return new Rect(i, this.A05, this.A04, this.A02);
    }

    public final MediaUploadMetadata A02() {
        MediaUploadMetadata mediaUploadMetadata;
        MediaUploadMetadata mediaUploadMetadata2 = this.A0S;
        Medium medium = this.A0R;
        if (medium != null) {
            mediaUploadMetadata = medium.A0G;
        } else {
            mediaUploadMetadata = null;
        }
        mediaUploadMetadata2.A01(mediaUploadMetadata);
        return mediaUploadMetadata2;
    }

    public final C195868lW A03() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            C9NR.A00(A0A, this);
            A0A.close();
            return C9NR.parseFromJson(C16V.A00(stringWriter.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final Integer A04() {
        C18160v1 c18160v1;
        List list;
        if (!this.A1K || (c18160v1 = this.A0U) == null || (list = c18160v1.A02) == null) {
            return null;
        }
        return (Integer) AbstractC001800i.A0O(list, 0);
    }

    public final String A05() {
        String str = this.A0m;
        if (str == null) {
            CameraAREffect cameraAREffect = this.A0P;
            if (cameraAREffect != null) {
                return cameraAREffect.A0K;
            }
            return null;
        }
        return str;
    }

    public final String A06() {
        Medium medium = this.A0R;
        if (medium != null) {
            return medium.A0O;
        }
        return null;
    }

    public final String A07() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0k);
        sb.append('_');
        sb.append(this.A0H);
        sb.append('_');
        sb.append(this.A06);
        return sb.toString();
    }

    public final HashSet A08() {
        HashSet hashSet = new HashSet();
        for (Object obj : this.A12) {
            C14360o3.A0B(obj, 0);
            Object obj2 = EnumC223259tC.A01.get(obj);
            if (obj2 != null) {
                hashSet.add(obj2);
            }
        }
        return hashSet;
    }

    public final int hashCode() {
        return A07().hashCode();
    }

    public C195868lW(File file, Integer num, String str, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A0k = "";
        this.A12 = new HashSet();
        this.A00 = 1;
        this.A0S = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A0K = i;
        this.A08 = i2;
        this.A09 = i3;
        this.A0f = str;
        this.A1J = z;
        this.A0k = file.getAbsolutePath();
        this.A18 = z2;
        this.A0L = j;
        this.A0M = j2;
        this.A1H = z3;
        this.A0F = z2 ? 0 : 1;
        this.A1M = num;
    }

    public C195868lW() {
        this.A0k = "";
        this.A12 = new HashSet();
        this.A00 = 1;
        this.A0S = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A1M = null;
    }
}
