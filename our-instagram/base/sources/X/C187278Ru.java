package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187278Ru implements InterfaceC187288Rv {
    public final DirectCameraViewModel A00;
    public final boolean A01;
    public final /* synthetic */ C187198Rm A02;

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    public C187278Ru(C187198Rm c187198Rm, DirectCameraViewModel directCameraViewModel, boolean z) {
        this.A02 = c187198Rm;
        this.A01 = z;
        this.A00 = directCameraViewModel;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final void DCd(int i) {
        GalleryItem galleryItem;
        C198308pf c198308pf;
        Object obj;
        Integer num;
        C187198Rm c187198Rm = this.A02;
        C187218Ro c187218Ro = c187198Rm.A0Y;
        GalleryItem galleryItem2 = c187218Ro.BJy(i).A01;
        int i2 = GalleryItem.A0B + 1;
        GalleryItem.A0B = i2;
        String A0O = AnonymousClass001.A0O(galleryItem2.A0A, i2);
        Integer num2 = galleryItem2.A09;
        if (num2 == C05F.A00) {
            Medium medium = galleryItem2.A00;
            if (medium != null) {
                galleryItem = new GalleryItem.LocalGalleryMedium(medium, A0O);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Draft draft = galleryItem2.A02;
            RemoteMedia remoteMedia = galleryItem2.A04;
            C195858lV c195858lV = galleryItem2.A05;
            C183978Ee c183978Ee = galleryItem2.A07;
            C195868lW c195868lW = galleryItem2.A08;
            galleryItem = new GalleryItem(draft, null, galleryItem2.A00, remoteMedia, c195858lV, galleryItem2.A06, c183978Ee, c195868lW, num2, A0O, galleryItem2.A01);
        }
        C9NH c9nh = new C9NH(galleryItem, null);
        int i3 = i + 1;
        if (c187218Ro.A01(c9nh, i3)) {
            String str = c9nh.A01.A0A;
            C1816783z c1816783z = c187198Rm.A0Q.A02;
            C198308pf c198308pf2 = (C198308pf) c1816783z.A05().get(i);
            if (c198308pf2.A05 == EnumC198268pb.A04) {
                C183978Ee c183978Ee2 = c198308pf2.A02;
                c183978Ee2.getClass();
                c198308pf = new C198308pf(null, c183978Ee2, str, false);
            } else {
                C195868lW c195868lW2 = c198308pf2.A03;
                c195868lW2.getClass();
                c198308pf = new C198308pf(c195868lW2, str);
            }
            C1815483h c1815483h = c1816783z.A01;
            List list = c1815483h.A0p;
            if (i < list.size()) {
                obj = list.get(i);
            } else {
                obj = null;
            }
            List list2 = c1815483h.A0n;
            list2.add(i3, c198308pf);
            list.add(obj);
            if (list2.size() == 1) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            c1815483h.A0B = num;
            return;
        }
        Activity activity = c187198Rm.A0A;
        C14360o3.A0B(activity, 0);
        String string = activity.getResources().getString(2131973246, 10);
        C14360o3.A07(string);
        C9GR.A09(activity, string);
    }

    @Override // X.InterfaceC187288Rv
    public final void DkG() {
        String string;
        C187198Rm c187198Rm = this.A02;
        if (c187198Rm.A0m.get() == C22P.A2T) {
            List<C198308pf> A05 = c187198Rm.A0Q.A02.A05();
            C8RZ c8rz = c187198Rm.A0K;
            c8rz.A0E(false);
            for (C198308pf c198308pf : A05) {
                if (c8rz.A0H.A00.containsKey(c198308pf.A06)) {
                    c187198Rm.A0k.put(c198308pf.A02(), new C203248yh(c8rz.A07(c198308pf)));
                }
            }
            c187198Rm.A0S.A0l.E2e();
            c187198Rm.A0g.run();
            InterfaceC1810081c interfaceC1810081c = c187198Rm.A0Z;
            ((C1809981b) interfaceC1810081c).A02.A04(new Object());
            return;
        }
        C187218Ro c187218Ro = c187198Rm.A0Y;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = c187218Ro.A01.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9NH) it.next()).A01.A0A);
        }
        C88X A01 = c187198Rm.A0R.A0H.A01();
        A01.getClass();
        C88Z c88z = A01.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        if (c88z.equals(C88Z.A09)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MSV.A00(176), true);
            bundle.putBoolean(MSV.A00(1357), true);
            bundle.putStringArrayList(MSV.A00(1305), arrayList);
            UserSession userSession = c187198Rm.A0G;
            FragmentActivity fragmentActivity = (FragmentActivity) c187198Rm.A0A;
            ArchiveReelFragment archiveReelFragment = (ArchiveReelFragment) C6XL.A00(bundle, fragmentActivity, userSession, AbstractC111324zv.A00(730));
            archiveReelFragment.getClass();
            archiveReelFragment.A05 = c187198Rm;
            archiveReelFragment.A06 = c187218Ro;
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0E(archiveReelFragment);
            c140966Yy.A03();
            return;
        }
        User user = c187198Rm.A0Q.A02.A01.A0A;
        C214939fV c214939fV = new C214939fV();
        Bundle bundle2 = new Bundle();
        UserSession userSession2 = c187198Rm.A0G;
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
        bundle2.putStringArrayList("selected_media_ids", arrayList);
        if (user == null) {
            bundle2.putString("dial_element_type", C88Z.A0I.A00);
            string = c187198Rm.A0A.getResources().getString(2131974469);
        } else {
            bundle2.putString("dial_element_type", C88Z.A0b.A00);
            bundle2.putString(AbstractC58317Pt9.A00(131), user.getId());
            string = c187198Rm.A0A.getResources().getString(2131973818, user.getUsername());
        }
        c214939fV.setArguments(bundle2);
        c214939fV.A01 = c187198Rm;
        C189448aO c189448aO = new C189448aO(userSession2);
        c189448aO.A0d = string;
        c189448aO.A0T = c214939fV;
        c189448aO.A0a = true;
        c189448aO.A03 = 0.7f;
        c189448aO.A00().A0D(c187198Rm.A0E.requireContext(), c214939fV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0300, code lost:
    
        if (r3.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0320, code lost:
    
        if (r14 != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36323560624631144L) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0489, code lost:
    
        if (r1.A00() == true) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0491, code lost:
    
        if (r0.A05 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0493, code lost:
    
        r83 = X.AbstractC50677MYv.A00(r0.A05.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x049d, code lost:
    
        if (r0.A05 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x049f, code lost:
    
        r1 = r0.A05;
        r63 = X.AbstractC50677MYv.A04(r1.A0E, r1.A0F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04a9, code lost:
    
        r66 = X.AHS.A00(r0.A04);
        X.AHS.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04b2, code lost:
    
        r69 = r5.A04();
        r65 = r5.A01();
        r79 = X.A0N.A00(r5);
        r1 = r5.A0g;
        r15 = r5.A0e;
        r14 = r5.A0i;
        X.C14360o3.A0B(r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04c9, code lost:
    
        if (r8 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04cb, code lost:
    
        if (r12 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04cd, code lost:
    
        r1 = new X.C23845Agu(r2.A0A.getApplicationContext(), r2.A0G, r21, r0, r22, r20, r5, r13.toString(), r18, r60);
        r3.A06(r0, null, null, r7, null, r0, r21, null, r22, r20, null, null, null, r5, null, false, "post_capture", r30, null, null, null, null, null, null, new X.B3U(r1), new X.B3S(), r60, false, false);
        r3 = new X.C22874A6u((X.C198308pf) r31.get(r9), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0564, code lost:
    
        r1 = r2.A0G;
        r4 = r13.toString();
        X.C14360o3.A0B(r1, 1);
        X.C14360o3.A0B(r7, 15);
        X.C14360o3.A0B(r4, 16);
        r1 = r18;
        X.C14360o3.A0B(r1, 20);
        r3.A04(r88, r0, null, null, r7, null, r0, r21, null, r22, r20, null, null, null, r5, null, false, "post_capture", r30, null, null, r4, null, r1, null, null, null, r60, false, false);
        r13.A02(r63, r64, r65, r66, null, r68, r69, r1, r71, r72, r1, null, null, r1, r15, r14, r79, r80, r81, r1, r83, r84);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x054c, code lost:
    
        r63 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x054e, code lost:
    
        if (r0 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0550, code lost:
    
        r66 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0546, code lost:
    
        r83 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0548, code lost:
    
        if (r0 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x048d, code lost:
    
        if (r0 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        if ((r0 instanceof X.InterfaceC2056098k) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        if (r4.A00() != true) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cd, code lost:
    
        if (r0.A05 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cf, code lost:
    
        r82 = X.AbstractC50677MYv.A00(r0.A05.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d9, code lost:
    
        if (r0.A05 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01db, code lost:
    
        r4 = r0.A05;
        r62 = X.AbstractC50677MYv.A04(r4.A0E, r4.A0F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e5, code lost:
    
        r65 = X.AHS.A00(r0.A04);
        X.AHS.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ee, code lost:
    
        r68 = r3.A04();
        r64 = r3.A02();
        X.C14360o3.A0B(r14, 1);
        r5 = r2.A0G;
        r57 = r11.A0F(r1);
        r1 = r13.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0201, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0203, code lost:
    
        r51 = r1.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0207, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        r1 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r4 = new X.C23844Agt(r5, r0, null, r0, r5, r21, null, r1, r0, r22, r20, null, null, r3, null, "post_capture", r30, null, r51, null, null, r18, null, null, r57, r60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022e, code lost:
    
        if (r8 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0230, code lost:
    
        if (r12 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0232, code lost:
    
        r3 = new X.C22874A6u((X.C198308pf) r31.get(r9), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023f, code lost:
    
        r12.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0246, code lost:
    
        r4.ENf(r88, null, false);
        r14.A02(r62, r7, r64, r65, null, r67, r68, r4, r70, r71, r15, null, null, null, null, null, null, r79, r80, r4, r82, r83);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0269, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x026b, code lost:
    
        r51 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0274, code lost:
    
        r62 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0276, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0278, code lost:
    
        r65 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026e, code lost:
    
        r82 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0270, code lost:
    
        if (r0 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c9, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f1  */
    @Override // X.InterfaceC187288Rv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dve(X.C26086BgF r88) {
        /*
            Method dump skipped, instructions count: 1599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187278Ru.Dve(X.BgF):void");
    }

    @Override // X.InterfaceC187288Rv
    public final void Dvh() {
        this.A02.A0T.A06();
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ejf() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }
}
