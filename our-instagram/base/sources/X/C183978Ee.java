package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.8Ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183978Ee {
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
    public long A0A;
    public long A0B;
    public Bitmap A0C;
    public C1814082s A0D;
    public CameraAREffect A0E;
    public Medium A0F;
    public MediaUploadMetadata A0G;
    public C18160v1 A0H;
    public C18160v1 A0I;
    public MusicOverlayStickerModel A0J;
    public C184758Hq A0K;
    public C183978Ee A0L;
    public C183978Ee A0M;
    public Boolean A0N;
    public Float A0O;
    public Float A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
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
    public List A0o;
    public List A0p;
    public List A0q;
    public List A0r;
    public List A0s;
    public java.util.Set A0t;
    public InterfaceC50122Sb A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public byte[] A1B;
    public byte[] A1C;
    public String A1D;

    public final void A0D(String str) {
        C14360o3.A0B(str, 0);
        this.A1D = str;
        this.A0z = !str.equals("unset_file_path");
        List list = this.A0D.A00;
        C14360o3.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C197658oc c197658oc = (C197658oc) list.get(i);
            UserSession userSession = c197658oc.A00;
            C183978Ee c183978Ee = c197658oc.A01;
            AbstractC60292pC.A02(userSession, new C196948nP(c183978Ee));
            c183978Ee.A0D.A02(c197658oc);
        }
    }

    public final Rect A00() {
        int i = this.A03;
        if (i == 0 && this.A05 == 0 && this.A04 == 0 && this.A02 == 0) {
            return null;
        }
        return new Rect(i, this.A05, this.A04, this.A02);
    }

    public final MediaUploadMetadata A01() {
        MediaUploadMetadata mediaUploadMetadata;
        MediaUploadMetadata mediaUploadMetadata2 = this.A0G;
        Medium medium = this.A0F;
        if (medium != null) {
            mediaUploadMetadata = medium.A0G;
        } else {
            mediaUploadMetadata = null;
        }
        mediaUploadMetadata2.A01(mediaUploadMetadata);
        return mediaUploadMetadata2;
    }

    public final C183978Ee A02() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC196958nQ.A00(A0A, this);
            A0A.close();
            return AbstractC196958nQ.parseFromJson(C16V.A00(stringWriter.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.A1A == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A04() {
        /*
            r2 = this;
            boolean r0 = r2.A0y
            if (r0 == 0) goto L9
            boolean r0 = r2.A1A
            r1 = 1
            if (r0 != 0) goto La
        L9:
            r1 = 0
        La:
            r0 = 0
            if (r1 == 0) goto L1c
            X.0v1 r1 = r2.A0I
            if (r1 == 0) goto L1c
            java.util.List r1 = r1.A02
            if (r1 == 0) goto L1c
            r0 = 0
            java.lang.Object r0 = X.AbstractC001800i.A0O(r1, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183978Ee.A04():java.lang.Integer");
    }

    public final String A05() {
        String str = this.A0X;
        if (str == null) {
            CameraAREffect cameraAREffect = this.A0E;
            if (cameraAREffect != null) {
                return cameraAREffect.A0K;
            }
            return null;
        }
        return str;
    }

    public final String A06() {
        if (C14360o3.A0K(this.A1D, "unset_file_path")) {
            if (this.A0u != null) {
                this.A1D = (String) C2ST.A00(AnonymousClass191.A00, new PZE(this, null, 28));
            } else {
                C0w9.A03("Photo.kt", "Photo file path is unset.");
            }
        }
        return this.A1D;
    }

    public final String A07() {
        String str = this.A0k;
        if (str == null) {
            str = (String) C2ST.A00(AnonymousClass191.A00, new PZE(this, null, 29));
        }
        this.A0k = str;
        return str;
    }

    public final List A08() {
        List list = this.A0p;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OTK) it.next()).A00);
            }
            return arrayList;
        }
        return null;
    }

    public final List A09() {
        List list = this.A0p;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9H2 A00 = AbstractC207699Gz.A00(((OTK) it.next()).A00);
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List A0A() {
        EnumC193878i8 enumC193878i8;
        List<OTK> list = this.A0p;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (OTK otk : list) {
                C14360o3.A0B(otk, 0);
                int ordinal = otk.A00.ordinal();
                if (ordinal != 18) {
                    if (ordinal != 127) {
                        if (ordinal == 7) {
                            enumC193878i8 = EnumC193878i8.A0A;
                        }
                    } else {
                        enumC193878i8 = EnumC193878i8.A0B;
                    }
                } else {
                    enumC193878i8 = EnumC193878i8.A09;
                }
                arrayList.add(enumC193878i8);
            }
            return arrayList;
        }
        return null;
    }

    public final java.util.Set A0B() {
        java.util.Set set = this.A0t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            C14360o3.A0B(obj, 0);
            Object obj2 = EnumC223259tC.A01.get(obj);
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        return AbstractC001800i.A0k(arrayList);
    }

    public final void A0C(Rect rect) {
        List A1Q;
        int i = rect.left;
        if (i == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            A1Q = null;
        } else {
            A1Q = AbstractC16960so.A1Q(Long.valueOf(i), Long.valueOf(rect.top), Long.valueOf(rect.right), Long.valueOf(rect.bottom));
        }
        this.A0q = A1Q;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C183978Ee) && AbstractC002300n.A0g(this.A0h, ((C183978Ee) obj).A0h, true)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A0h.hashCode();
    }

    public C183978Ee(Medium medium, int i, int i2) {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0h = obj;
        this.A1D = "unset_file_path";
        this.A0t = new HashSet();
        this.A0G = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A0j = "";
        this.A0D = new C1814082s();
        this.A09 = i;
        this.A06 = i2;
        this.A0F = medium;
        this.A0I = AbstractC14620oa.A01(medium.A0H, medium.A07);
        A0D(new File(medium.A0X).getAbsolutePath());
        this.A13 = true;
        this.A0A = medium.A0C * 1000;
        this.A0B = medium.A0D;
        this.A08 = medium.A0G.A0B ? 54 : 0;
        this.A0k = medium.A0X;
        this.A19 = true;
    }

    public final File A03() {
        return new File(A06());
    }

    public final boolean A0E() {
        if (A09() == null || !(!r0.isEmpty())) {
            return false;
        }
        return true;
    }

    public C183978Ee(File file, int i, int i2, long j, long j2, boolean z) {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0h = obj;
        this.A1D = "unset_file_path";
        this.A0t = new HashSet();
        this.A0G = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A0j = "";
        this.A0D = new C1814082s();
        this.A09 = i;
        this.A06 = i2;
        this.A14 = z;
        this.A0A = j;
        this.A0B = j2;
        this.A08 = 1;
        this.A19 = true;
        if (file != null) {
            A0D(file.getAbsolutePath());
            this.A0k = A06();
        }
    }

    public C183978Ee() {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0h = obj;
        this.A1D = "unset_file_path";
        this.A0t = new HashSet();
        this.A0G = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A0j = "";
        this.A0D = new C1814082s();
    }
}
