package X;

import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.83z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1816783z {
    public boolean A00 = false;
    public final C1815483h A01;

    public final void A07(C198308pf c198308pf) {
        Integer num;
        C14360o3.A0B(c198308pf, 0);
        C1815483h c1815483h = this.A01;
        if (c1815483h.A07()) {
            int i = c1815483h.A00;
            c1815483h.A06(i);
            List list = c1815483h.A0n;
            list.add(i, c198308pf);
            c1815483h.A0p.add(null);
            if (list.size() == 1) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            c1815483h.A0B = num;
            c1815483h.A00 = i;
            C1815483h.A00(c1815483h);
        }
    }

    public final void A08(Integer num) {
        C14360o3.A0B(num, 0);
        this.A01.A0D = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r2.A02().A06 != X.C88Z.A09) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(java.util.List r8) {
        /*
            r7 = this;
            r4 = 0
            X.C14360o3.A0B(r8, r4)
            X.83h r2 = r7.A01
            java.util.List r3 = r2.A0n
            r3.clear()
            r2.A00 = r4
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L50
            X.81M r0 = r2.A02()
            r6 = 1
            if (r0 == 0) goto L25
            X.81M r0 = r2.A02()
            X.88Z r5 = r0.A06
            X.88Z r0 = X.C88Z.A09
            r1 = 1
            if (r5 == r0) goto L26
        L25:
            r1 = 0
        L26:
            int r0 = r8.size()
            if (r0 != r6) goto L96
            if (r1 != 0) goto L96
            java.lang.Integer r0 = X.C05F.A01
        L30:
            r2.A0B = r0
            r3.addAll(r8)
            X.83k r0 = r2.A04
            if (r0 == 0) goto L5d
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r0.A08
            if (r5 == 0) goto L5d
        L3d:
            java.lang.Object r2 = r3.get(r4)
            X.8pf r2 = (X.C198308pf) r2
            X.8pb r1 = r2.A05
            X.8pb r0 = X.EnumC198268pb.A07
            if (r1 != r0) goto L51
            X.8lW r0 = r2.A03
            r0.getClass()
            r0.A0V = r5
        L50:
            return
        L51:
            X.8pb r0 = X.EnumC198268pb.A04
            if (r1 != r0) goto L50
            X.8Ee r0 = r2.A02
            r0.getClass()
            r0.A0J = r5
            return
        L5d:
            X.1qM r0 = r2.A08
            if (r0 == 0) goto L50
            boolean r0 = r0.A63()
            if (r0 == 0) goto L50
            X.1qM r0 = r2.A08
            r0.getClass()
            r1 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.AbstractC101614hW.A03(r1, r0, r1)
            if (r0 == 0) goto L50
            X.1qM r0 = r2.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.AbstractC101614hW.A03(r1, r0, r1)
            if (r0 == 0) goto L7f
            boolean r0 = r0.A0t
            if (r0 != 0) goto L50
        L7f:
            X.1qM r0 = r2.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = X.AbstractC101614hW.A03(r1, r0, r1)
            r2.getClass()
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.A0A
            X.ABz r0 = new X.ABz
            r0.<init>(r2)
            r0.A02 = r1
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r0.A00()
            goto L3d
        L96:
            java.lang.Integer r0 = X.C05F.A0C
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1816783z.A09(java.util.List):void");
    }

    public final C198308pf A00() {
        C1815483h c1815483h = this.A01;
        C198308pf c198308pf = (C198308pf) c1815483h.A0n.get(c1815483h.A00);
        C14360o3.A07(c198308pf);
        return c198308pf;
    }

    public final EnumC198268pb A01() {
        EnumC198268pb A01 = this.A01.A01();
        C14360o3.A07(A01);
        return A01;
    }

    public final EnumC198268pb A02() {
        C1815783k c1815783k;
        EnumC198268pb A01;
        C1815483h c1815483h = this.A01;
        C83o c83o = c1815483h.A0g;
        if ((c83o != null && c83o.A0D) || ((c1815783k = c1815483h.A04) != null && c1815783k.A0F && c1815783k.A0G)) {
            A01 = EnumC198268pb.A07;
        } else {
            A01 = c1815483h.A01();
        }
        C14360o3.A07(A01);
        return A01;
    }

    public final Integer A03() {
        C1810981l c1810981l = this.A01.A0Y;
        c1810981l.getClass();
        Integer A0A = c1810981l.A0A();
        C14360o3.A07(A0A);
        return A0A;
    }

    public final String A04() {
        String str;
        C1815483h c1815483h = this.A01;
        if (!c1815483h.A07()) {
            return "unknown";
        }
        C198308pf c198308pf = (C198308pf) c1815483h.A0n.get(c1815483h.A00);
        if (c198308pf.A05.ordinal() != 0) {
            C195868lW c195868lW = c198308pf.A03;
            c195868lW.getClass();
            str = c195868lW.A0f;
            if (str == null) {
                return "back";
            }
        } else {
            C183978Ee c183978Ee = c198308pf.A02;
            c183978Ee.getClass();
            if (c183978Ee.A0a == null) {
                return "back";
            }
            str = c198308pf.A02.A0a;
        }
        str.getClass();
        return str;
    }

    public final List A05() {
        List unmodifiableList = Collections.unmodifiableList(this.A01.A0n);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final void A06() {
        C1815483h c1815483h = this.A01;
        c1815483h.A0F = UUID.randomUUID().toString();
        c1815483h.A0c.A00.close();
        c1815483h.A03 = null;
    }

    public final boolean A0A() {
        C1816283r c1816283r = this.A01.A0i;
        if (c1816283r != null && EnumC209589Ot.A04 == c1816283r.A02) {
            return true;
        }
        return false;
    }

    public final boolean A0B() {
        C1816283r c1816283r = this.A01.A0i;
        if (c1816283r != null && EnumC209589Ot.A04 == c1816283r.A02 && c1816283r.A00 == EnumC189548aZ.A07) {
            return true;
        }
        return false;
    }

    public final boolean A0C() {
        if (this.A01.A03 != GalleryGridFormat.A07) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r0.A17 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0D() {
        /*
            r7 = this;
            X.83h r6 = r7.A01
            boolean r0 = r6.A0q
            r5 = 0
            if (r0 == 0) goto L37
            X.81M r4 = r6.A02()
            if (r4 == 0) goto L38
            X.88Z r1 = r4.A06
            X.88Z r0 = X.C88Z.A0f
            if (r1 == r0) goto L17
            X.88Z r0 = X.C88Z.A0b
            if (r1 != r0) goto L38
        L17:
            r3 = 1
        L18:
            X.83j r0 = r6.A0a
            r2 = 0
            if (r0 == 0) goto L1e
            r2 = 1
        L1e:
            X.8Ee r0 = r6.A03()
            if (r0 == 0) goto L29
            boolean r0 = r0.A17
            r1 = 1
            if (r0 != 0) goto L2a
        L29:
            r1 = 0
        L2a:
            if (r4 == 0) goto L30
            boolean r0 = r4.A0C
            if (r0 == 0) goto L37
        L30:
            if (r3 != 0) goto L37
            if (r2 != 0) goto L37
            if (r1 != 0) goto L37
            r5 = 1
        L37:
            return r5
        L38:
            r3 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1816783z.A0D():boolean");
    }

    public final boolean A0E() {
        if (this.A01.A0i == null) {
            return false;
        }
        return true;
    }

    public final boolean A0F() {
        C1815483h c1815483h = this.A01;
        C1816283r c1816283r = c1815483h.A0i;
        if (c1816283r != null && EnumC209589Ot.A05 == c1816283r.A02 && "story_remix_reply".equals(c1815483h.A0m)) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        C81M A02;
        C1815483h c1815483h = this.A01;
        if ((c1815483h.A0D == C05F.A01 && c1815483h.A0G == null) || (A02 = c1815483h.A02()) == null || !c1815483h.A08()) {
            return false;
        }
        return !A02.A0D;
    }

    public C1816783z(C1815483h c1815483h) {
        this.A01 = c1815483h;
    }
}
