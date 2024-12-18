package X;

import android.graphics.Bitmap;
import android.os.CancellationSignal;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

/* renamed from: X.MLg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50354MLg extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public static C160667Ia A00(Object obj, C50354MLg c50354MLg) {
        C14360o3.A0B(obj, 0);
        return (C160667Ia) c50354MLg.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50354MLg(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewGroup viewGroup;
        C79S A00;
        AbstractC66422zJ A0L;
        LayoutInflater layoutInflater;
        C7IM A0T;
        UserSession userSession;
        C1584879i A13;
        InterfaceC1584679g c48926LkY;
        C79L c48871LjN;
        C79O c48847Liv;
        AnonymousClass797 li6;
        AnonymousClass795 anonymousClass795;
        AnonymousClass795 anonymousClass7952;
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                C45466KBb c45466KBb = (C45466KBb) this.A01;
                IgEditText igEditText = c45466KBb.A0I;
                if (igEditText != null) {
                    Editable text = igEditText.getText();
                    IgEditText igEditText2 = c45466KBb.A0I;
                    if (igEditText2 != null) {
                        text.insert(igEditText2.getSelectionStart(), str);
                        UserSession A0r = AbstractC166987dD.A0r(c45466KBb.A1V);
                        String str2 = c45466KBb.A0n;
                        if (str2 != null) {
                            C14360o3.A0B(A0r, 0);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0r), "instagram_media_note_quick_emojis_click_client");
                            if (A0f.isSampled()) {
                                A0f.AAP("media_id", str2);
                                A0f.Cht();
                            }
                            return C0eB.A00;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                }
                C14360o3.A0F("noteEditText");
                throw C00O.createAndThrow();
            case 1:
                C45466KBb c45466KBb2 = (C45466KBb) this.A01;
                int A04 = AbstractC167017dG.A04(c45466KBb2.requireContext());
                int A0D = AbstractC167017dG.A0D(c45466KBb2.requireContext());
                int i = 0;
                if (!AbstractC167007dF.A1Z(c45466KBb2.A1N)) {
                    i = A0D;
                }
                return Integer.valueOf(A04 + i);
            case 2:
                L5L A0M = AbstractC31174DnI.A0M(obj);
                A0M.A01 = new LinearLayoutManager(((Fragment) this.A01).getContext());
                A0M.A0C = true;
                A0M.A09 = true;
                return C0eB.A00;
            case 3:
                C07X c07x = (C07X) obj;
                C14360o3.A0A(c07x);
                AbstractC166987dD.A1Z(new MC6(c07x, this.A01, (InterfaceC23621Ds) null, 10), C07Y.A00(c07x));
                return C0eB.A00;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                C14360o3.A0B(entry, 0);
                return Boolean.valueOf(((C4F5) entry.getValue()).A0A.equals(((C4F5) this.A01).A0A));
            case 5:
                InlineLinkUrn inlineLinkUrn = (InlineLinkUrn) obj;
                C14360o3.A0B(inlineLinkUrn, 0);
                String A002 = inlineLinkUrn.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A002 != null) {
                    KDK kdk = (KDK) this.A01;
                    LKo.A01(kdk.requireActivity(), null, AbstractC166987dD.A0r(kdk.A0Q), null, kdk.A0N, A002, false);
                }
                return C0eB.A00;
            case 6:
                C09530e4 c09530e4 = (C09530e4) obj;
                Object obj2 = c09530e4.A00;
                C14360o3.A07(obj2);
                Object obj3 = c09530e4.A01;
                C14360o3.A07(obj3);
                if (!AbstractC166987dD.A1a(obj3) && !((JTM) this.A01).A00) {
                    return C42221xC.A00();
                }
                return C42221xC.A09(obj2);
            case 7:
                Bitmap bitmap = (Bitmap) obj;
                C14360o3.A0B(bitmap, 0);
                File file = ((C45607KGv) this.A01).A09;
                C14360o3.A07(file);
                File file2 = new File(file, AnonymousClass001.A03(bitmap.hashCode(), ".png"));
                file2.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C0fK.A02(Bitmap.CompressFormat.PNG, bitmap, byteArrayOutputStream, 0);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
                return AbstractC43592JPx.A0x(file2);
            case 8:
                ((CancellationSignal) this.A01).cancel();
                return C0eB.A00;
            case 9:
                viewGroup = (ViewGroup) obj;
                C160667Ia A003 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A003);
                A0L = JQ0.A0L(C160667Ia.A02(A003).A0v);
                layoutInflater = A003.A02.A00;
                A0T = JQ0.A0T(A003, A0L);
                userSession = A00.A00;
                A13 = A00.A01.A13();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 10:
                viewGroup = (ViewGroup) obj;
                C160667Ia A004 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A004);
                A0L = JQ0.A0L(C160667Ia.A02(A004).A0q);
                layoutInflater = A004.A02.A00;
                A0T = JQ0.A0T(A004, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7953 = A00.A01;
                c48926LkY = new C48926LkY();
                c48871LjN = new C48871LjN();
                c48847Liv = new C48847Liv(anonymousClass7953);
                li6 = new Li6(anonymousClass7953);
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 11:
                viewGroup = (ViewGroup) obj;
                C160667Ia A005 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A005);
                A0L = JQ0.A0L(C160667Ia.A02(A005).A0p);
                layoutInflater = A005.A02.A00;
                A0T = JQ0.A0T(A005, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7954 = A00.A01;
                c48926LkY = new C48889Ljg();
                c48871LjN = new C48863LjF();
                c48847Liv = new C48811LiJ(anonymousClass7954);
                li6 = new C48789Lhw(anonymousClass7954);
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                viewGroup = (ViewGroup) obj;
                C160667Ia A006 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A006);
                A0L = JQ0.A0L(C160667Ia.A02(A006).A0n);
                layoutInflater = A006.A02.A00;
                A0T = JQ0.A0T(A006, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7955 = A00.A01;
                c48926LkY = new C48909Lk0();
                c48871LjN = new C48867LjJ();
                c48847Liv = new C48828Lic(anonymousClass7955);
                li6 = new C48793Li0(anonymousClass7955);
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                viewGroup = (ViewGroup) obj;
                C160667Ia A007 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A007);
                A0L = JQ0.A0L(C160667Ia.A02(A007).A2M);
                layoutInflater = A007.A02.A00;
                A0T = JQ0.A0T(A007, A0L);
                userSession = A00.A00;
                anonymousClass795 = A00.A01;
                c48926LkY = new JW3();
                c48871LjN = JQ0.A0R(anonymousClass795);
                c48847Liv = new JW2(anonymousClass795);
                li6 = anonymousClass795.A03;
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 14:
                viewGroup = (ViewGroup) obj;
                C160667Ia A008 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A008);
                A0L = JQ0.A0L(C160667Ia.A02(A008).A2U);
                layoutInflater = A008.A02.A00;
                A0T = JQ0.A0T(A008, A0L);
                userSession = A00.A00;
                A13 = A00.A01.A0l();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case Process.SIGTERM /* 15 */:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                C14360o3.A0B(viewGroup2, 0);
                JVM jvm = JVP.A05;
                C160667Ia c160667Ia = (C160667Ia) this.A01;
                LayoutInflater layoutInflater2 = c160667Ia.A02.A00;
                C162917Rc c162917Rc = (C162917Rc) C160667Ia.A02(c160667Ia).A2Z.getValue();
                return new JVP(layoutInflater2, viewGroup2, c160667Ia.A07, c160667Ia.A0C, c160667Ia.A03, c160667Ia.A04, c162917Rc, c160667Ia.A0E);
            case 16:
                viewGroup = (ViewGroup) obj;
                C160667Ia A009 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A009);
                A0L = JQ0.A0L(C160667Ia.A02(A009).A2S);
                layoutInflater = A009.A02.A00;
                A0T = JQ0.A0T(A009, A0L);
                userSession = A00.A00;
                A13 = A00.A01.A0k();
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 17:
                ViewGroup viewGroup3 = (ViewGroup) obj;
                C160667Ia A0010 = A00(viewGroup3, this);
                AbstractC66422zJ A0L2 = JQ0.A0L(C160667Ia.A02(A0010).A21);
                LayoutInflater layoutInflater3 = A0010.A02.A00;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C44696Jqf c44696Jqf = new C44696Jqf(AbstractC25226BEj.A0R(layoutInflater3, viewGroup3, R.layout.layout_shhmode_thread_title, false));
                C14360o3.A0B(A0L2, 2);
                return new AbstractC161677Mc(c44696Jqf, A0L2);
            case 18:
                ViewGroup viewGroup4 = (ViewGroup) obj;
                boolean A1Y = AbstractC43592JPx.A1Y(viewGroup4);
                C160667Ia c160667Ia2 = (C160667Ia) this.A01;
                AbstractC66422zJ A0L3 = JQ0.A0L(C160667Ia.A02(c160667Ia2).A1z);
                LayoutInflater layoutInflater4 = c160667Ia2.A02.A00;
                C14360o3.A0B(A0L3, A1Y ? 1 : 0);
                return new AbstractC161677Mc(new C44696Jqf(layoutInflater4.inflate(R.layout.layout_shhmode_thread_title, viewGroup4, A1Y)), A0L3);
            case Process.SIGSTOP /* 19 */:
                viewGroup = (ViewGroup) obj;
                C160667Ia A0011 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A0011);
                A0L = JQ0.A0L(C160667Ia.A02(A0011).A0b);
                layoutInflater = A0011.A02.A00;
                A0T = JQ0.A0T(A0011, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7956 = A00.A01;
                C48952Lky c48952Lky = new C48952Lky(8);
                A13 = new C1584879i(anonymousClass7956.A01, anonymousClass7956.A08, anonymousClass7956.A0A, c48952Lky);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 20:
                ViewGroup viewGroup5 = (ViewGroup) obj;
                boolean A1Y2 = AbstractC43592JPx.A1Y(viewGroup5);
                C160667Ia c160667Ia3 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater5 = c160667Ia3.A02.A00;
                AbstractC66422zJ A0L4 = JQ0.A0L(C160667Ia.A02(c160667Ia3).A1y);
                C14360o3.A0B(A0L4, 3);
                return new AbstractC161677Mc(new C44635Jpf(AbstractC25226BEj.A0R(layoutInflater5, viewGroup5, R.layout.layout_shh_mode_interleaved_footer, A1Y2)), A0L4);
            case 21:
                ViewGroup viewGroup6 = (ViewGroup) obj;
                boolean A1Y3 = AbstractC43592JPx.A1Y(viewGroup6);
                C160667Ia c160667Ia4 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater6 = c160667Ia4.A02.A00;
                AbstractC66422zJ A0L5 = JQ0.A0L(C160667Ia.A02(c160667Ia4).A20);
                C14360o3.A0B(A0L5, 3);
                return new AbstractC161677Mc(new C44717Jr0(AbstractC25226BEj.A0R(layoutInflater6, viewGroup6, R.layout.layout_shhmode_intro_qp, A1Y3)), A0L5);
            case 22:
                ViewGroup viewGroup7 = (ViewGroup) obj;
                C14360o3.A0B(viewGroup7, 0);
                C47725L5m c47725L5m = C45857KRm.A05;
                C160667Ia c160667Ia5 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater7 = c160667Ia5.A02.A00;
                C45879KSi c45879KSi = (C45879KSi) C160667Ia.A02(c160667Ia5).A2i.getValue();
                return new C45857KRm(layoutInflater7, viewGroup7, c160667Ia5.A07, c160667Ia5.A0C, c160667Ia5.A03, c160667Ia5.A04, c45879KSi);
            case 23:
                viewGroup = (ViewGroup) obj;
                C160667Ia A0012 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A0012);
                A0L = JQ0.A0L(C160667Ia.A02(A0012).A2T);
                layoutInflater = A0012.A02.A00;
                A0T = JQ0.A0T(A0012, A0L);
                userSession = A00.A00;
                anonymousClass795 = A00.A01;
                c48926LkY = new C48893Ljk();
                c48871LjN = JQ0.A0R(anonymousClass795);
                c48847Liv = new C48813LiL(anonymousClass795);
                li6 = anonymousClass795.A03;
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 24:
                ViewGroup viewGroup8 = (ViewGroup) obj;
                boolean A1Y4 = AbstractC43592JPx.A1Y(viewGroup8);
                C160667Ia c160667Ia6 = (C160667Ia) this.A01;
                AbstractC66422zJ A0L6 = JQ0.A0L(C160667Ia.A02(c160667Ia6).A0X);
                LayoutInflater layoutInflater8 = c160667Ia6.A02.A00;
                C14360o3.A0B(A0L6, A1Y4 ? 1 : 0);
                View inflate = layoutInflater8.inflate(R.layout.layout_ephemerality_mode_thread_nux, viewGroup8, A1Y4);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                return new AbstractC161677Mc(new C44631Jpb((TextView) inflate), A0L6);
            case 25:
                ViewGroup viewGroup9 = (ViewGroup) obj;
                C160667Ia A0013 = A00(viewGroup9, this);
                AbstractC66422zJ A0L7 = JQ0.A0L(C160667Ia.A02(A0013).A1l);
                LayoutInflater layoutInflater9 = A0013.A02.A00;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate2 = layoutInflater9.inflate(R.layout.layout_quiet_mode_nudge, viewGroup9, false);
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                C44672JqH c44672JqH = new C44672JqH(inflate2);
                C14360o3.A0B(A0L7, 2);
                return new AbstractC161677Mc(c44672JqH, A0L7);
            case 26:
                ViewGroup viewGroup10 = (ViewGroup) obj;
                JQ0.A1M(viewGroup10);
                C160667Ia c160667Ia7 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater10 = c160667Ia7.A02.A00;
                KSN ksn = (KSN) C160667Ia.A02(c160667Ia7).A15.getValue();
                return new C45853KRi(layoutInflater10, viewGroup10, c160667Ia7.A07, c160667Ia7.A0C, c160667Ia7.A03, ksn, c160667Ia7.A04);
            case 27:
                ViewGroup viewGroup11 = (ViewGroup) obj;
                C160667Ia A0014 = A00(viewGroup11, this);
                C160667Ia.A02(A0014).A0P.getValue();
                LayoutInflater layoutInflater11 = A0014.A02.A00;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate3 = layoutInflater11.inflate(R.layout.collapsable_message, viewGroup11, false);
                C14360o3.A0C(inflate3, "null cannot be cast to non-null type android.widget.TextView");
                return new KS3((KHX) C160667Ia.A02(A0014).A0P.getValue(), new C44760Jrh((TextView) inflate3));
            case 28:
                ViewGroup viewGroup12 = (ViewGroup) obj;
                C160667Ia A0015 = A00(viewGroup12, this);
                LayoutInflater layoutInflater12 = A0015.A02.A00;
                C45883KSm c45883KSm = (C45883KSm) C160667Ia.A02(A0015).A0l.getValue();
                C7ZX c7zx = A0015.A0C;
                UserSession userSession2 = A0015.A07;
                C7IM c7im = A0015.A04;
                AnonymousClass988 anonymousClass988 = A0015.A03;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new KRP(userSession2, c45883KSm.createViewHolder(layoutInflater12, viewGroup12), c7zx, anonymousClass988, c45883KSm, c7im);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ViewGroup viewGroup13 = (ViewGroup) obj;
                JQ0.A1M(viewGroup13);
                C160667Ia c160667Ia8 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater13 = c160667Ia8.A02.A00;
                KSL ksl = (KSL) C160667Ia.A02(c160667Ia8).A0o.getValue();
                C7ZX c7zx2 = c160667Ia8.A0C;
                UserSession userSession3 = c160667Ia8.A07;
                C7IM c7im2 = c160667Ia8.A04;
                AnonymousClass988 anonymousClass9882 = c160667Ia8.A03;
                C14360o3.A0B(ksl, 2);
                C7SP createViewHolder = ksl.createViewHolder(layoutInflater13, viewGroup13);
                C14360o3.A07(createViewHolder);
                return new KRQ(userSession3, createViewHolder, c7zx2, anonymousClass9882, ksl, c7im2);
            case 30:
                ViewGroup viewGroup14 = (ViewGroup) obj;
                C160667Ia A0016 = A00(viewGroup14, this);
                if (A0016.A0B.A00(45)) {
                    return new C27209BzS(A0016.A09);
                }
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession4 = A0016.A07;
                C159037Bp c159037Bp = (C159037Bp) C160667Ia.A02(A0016).A26.getValue();
                return new C159047Bq(userSession4, A0016.A0A, JQ0.A0S(A0016.A02.A00, viewGroup14, c159037Bp), A0016.A0C, A0016.A03, c159037Bp, A0016.A04);
            case 31:
                ViewGroup viewGroup15 = (ViewGroup) obj;
                JQ0.A1M(viewGroup15);
                C160667Ia c160667Ia9 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater14 = c160667Ia9.A02.A00;
                KSO kso = (KSO) C160667Ia.A02(c160667Ia9).A18.getValue();
                return new KRT(layoutInflater14, viewGroup15, c160667Ia9.A07, c160667Ia9.A0C, c160667Ia9.A03, kso, c160667Ia9.A04);
            case 32:
                ViewGroup viewGroup16 = (ViewGroup) obj;
                C160667Ia A0017 = A00(viewGroup16, this);
                LayoutInflater layoutInflater15 = A0017.A02.A00;
                C77Y c77y = (C77Y) C160667Ia.A02(A0017).A0m.getValue();
                C7ZX c7zx3 = A0017.A0C;
                UserSession userSession5 = A0017.A07;
                C7IM c7im3 = A0017.A04;
                AnonymousClass988 anonymousClass9883 = A0017.A03;
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C1579577f(userSession5, c77y.createViewHolder(layoutInflater15, viewGroup16), c7zx3, anonymousClass9883, c77y, c7im3);
            case 33:
                ViewGroup viewGroup17 = (ViewGroup) obj;
                JQ0.A1M(viewGroup17);
                C160667Ia c160667Ia10 = (C160667Ia) this.A01;
                return new KRL(c160667Ia10.A02.A00, viewGroup17, c160667Ia10.A07, (KSI) C160667Ia.A02(c160667Ia10).A0Q.getValue(), c160667Ia10.A0C, c160667Ia10.A03, c160667Ia10.A04);
            case 34:
                ViewGroup viewGroup18 = (ViewGroup) obj;
                JQ0.A1M(viewGroup18);
                C160667Ia c160667Ia11 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater16 = c160667Ia11.A02.A00;
                C45873KSc c45873KSc = (C45873KSc) C160667Ia.A02(c160667Ia11).A1k.getValue();
                return new C45845KRa(layoutInflater16, viewGroup18, c160667Ia11.A07, c160667Ia11.A0C, c160667Ia11.A03, c45873KSc, c160667Ia11.A04);
            case 35:
                ViewGroup viewGroup19 = (ViewGroup) obj;
                JQ0.A1M(viewGroup19);
                C160667Ia c160667Ia12 = (C160667Ia) this.A01;
                return new KRI(c160667Ia12.A02.A00, viewGroup19, c160667Ia12.A07, (C45881KSk) C160667Ia.A02(c160667Ia12).A0A.getValue(), c160667Ia12.A0C, c160667Ia12.A03, c160667Ia12.A04);
            case 36:
                ViewGroup viewGroup20 = (ViewGroup) obj;
                boolean A1Y5 = AbstractC43592JPx.A1Y(viewGroup20);
                C160667Ia c160667Ia13 = (C160667Ia) this.A01;
                AbstractC66422zJ A0L8 = JQ0.A0L(C160667Ia.A02(c160667Ia13).A01);
                LayoutInflater layoutInflater17 = c160667Ia13.A02.A00;
                C14360o3.A0B(A0L8, A1Y5 ? 1 : 0);
                return new AbstractC161677Mc(new C44777Jry(layoutInflater17.inflate(R.layout.direct_thread_context_lines, viewGroup20, A1Y5)), A0L8);
            case 37:
                ViewGroup viewGroup21 = (ViewGroup) obj;
                boolean A1Y6 = AbstractC43592JPx.A1Y(viewGroup21);
                C160667Ia c160667Ia14 = (C160667Ia) this.A01;
                AbstractC66422zJ A0L9 = JQ0.A0L(C160667Ia.A02(c160667Ia14).A0T);
                LayoutInflater layoutInflater18 = c160667Ia14.A02.A00;
                C14360o3.A0B(A0L9, A1Y6 ? 1 : 0);
                return new AbstractC161677Mc(new C44776Jrx(AbstractC25226BEj.A0R(layoutInflater18, viewGroup21, R.layout.direct_thread_null_state_container, A1Y6)), A0L9);
            case 38:
                ViewGroup viewGroup22 = (ViewGroup) obj;
                JQ0.A1M(viewGroup22);
                C160667Ia c160667Ia15 = (C160667Ia) this.A01;
                return new C45864KRt(c160667Ia15.A02.A00, viewGroup22, c160667Ia15.A07, c160667Ia15.A03, (KIQ) C160667Ia.A02(c160667Ia15).A1a.getValue(), c160667Ia15.A04);
            case 39:
                ViewGroup viewGroup23 = (ViewGroup) obj;
                JQ0.A1M(viewGroup23);
                C160667Ia c160667Ia16 = (C160667Ia) this.A01;
                return new KRD(c160667Ia16.A02.A00, viewGroup23, c160667Ia16.A07, (KSJ) C160667Ia.A02(c160667Ia16).A0S.getValue(), c160667Ia16.A0C, c160667Ia16.A03, c160667Ia16.A04);
            case 40:
                viewGroup = (ViewGroup) obj;
                C160667Ia A0018 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A0018);
                A0L = JQ0.A0L(C160667Ia.A02(A0018).A0f);
                layoutInflater = A0018.A02.A00;
                A0T = JQ0.A0T(A0018, A0L);
                userSession = A00.A00;
                AnonymousClass795 anonymousClass7957 = A00.A01;
                C48952Lky c48952Lky2 = new C48952Lky(5);
                A13 = new C1584879i(anonymousClass7957.A06, anonymousClass7957.A08, anonymousClass7957.A0A, c48952Lky2);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case Seq.NULL_REFNUM /* 41 */:
                ViewGroup viewGroup24 = (ViewGroup) obj;
                JQ0.A1M(viewGroup24);
                C160667Ia c160667Ia17 = (C160667Ia) this.A01;
                UserSession userSession6 = c160667Ia17.A07;
                C45874KSd c45874KSd = (C45874KSd) C160667Ia.A02(c160667Ia17).A0Y.getValue();
                return new C45862KRr(userSession6, c160667Ia17.A0A, JQ0.A0S(c160667Ia17.A02.A00, viewGroup24, c45874KSd), c160667Ia17.A0C, c160667Ia17.A03, c45874KSd, c160667Ia17.A04);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ViewGroup viewGroup25 = (ViewGroup) obj;
                JQ0.A1M(viewGroup25);
                C160667Ia c160667Ia18 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater19 = c160667Ia18.A02.A00;
                KST kst = (KST) C160667Ia.A02(c160667Ia18).A1S.getValue();
                return new KRW(layoutInflater19, viewGroup25, c160667Ia18.A07, c160667Ia18.A0C, c160667Ia18.A03, kst, c160667Ia18.A04);
            case 43:
                ViewGroup viewGroup26 = (ViewGroup) obj;
                JQ0.A1M(viewGroup26);
                C160667Ia c160667Ia19 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater20 = c160667Ia19.A02.A00;
                KSU ksu = (KSU) C160667Ia.A02(c160667Ia19).A1x.getValue();
                return new C45847KRc(layoutInflater20, viewGroup26, c160667Ia19.A07, c160667Ia19.A0C, c160667Ia19.A03, ksu, c160667Ia19.A04);
            case 44:
                ViewGroup viewGroup27 = (ViewGroup) obj;
                JQ0.A1M(viewGroup27);
                C160667Ia c160667Ia20 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater21 = c160667Ia20.A02.A00;
                C45884KSn c45884KSn = (C45884KSn) C160667Ia.A02(c160667Ia20).A0V.getValue();
                return new KRN(layoutInflater21, viewGroup27, c160667Ia20.A07, c160667Ia20.A0C, c160667Ia20.A03, c45884KSn, c160667Ia20.A04);
            case 45:
                ViewGroup viewGroup28 = (ViewGroup) obj;
                JQ0.A1M(viewGroup28);
                C160667Ia c160667Ia21 = (C160667Ia) this.A01;
                LayoutInflater layoutInflater22 = c160667Ia21.A02.A00;
                C45885KSo c45885KSo = (C45885KSo) C160667Ia.A02(c160667Ia21).A0U.getValue();
                return new KRS(layoutInflater22, viewGroup28, c160667Ia21.A07, c160667Ia21.A0C, c160667Ia21.A03, c45885KSo, c160667Ia21.A04);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                ViewGroup viewGroup29 = (ViewGroup) obj;
                JQ0.A1M(viewGroup29);
                C160667Ia c160667Ia22 = (C160667Ia) this.A01;
                return new C45865KRu(c160667Ia22.A02.A00, viewGroup29, c160667Ia22.A07, c160667Ia22.A03, (KIC) C160667Ia.A02(c160667Ia22).A22.getValue(), c160667Ia22.A04);
            case 47:
                viewGroup = (ViewGroup) obj;
                C160667Ia A0019 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A0019);
                A0L = JQ0.A0L(C160667Ia.A02(A0019).A32);
                layoutInflater = A0019.A02.A00;
                A0T = JQ0.A0T(A0019, A0L);
                userSession = A00.A00;
                anonymousClass7952 = A00.A01;
                c48926LkY = new C48903Lju();
                c48871LjN = JQ0.A0R(anonymousClass7952);
                c48847Liv = new C48821LiT(anonymousClass7952);
                li6 = new C48790Lhx(anonymousClass7952);
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            case 48:
                viewGroup = (ViewGroup) obj;
                C160667Ia A0020 = A00(viewGroup, this);
                A00 = C160667Ia.A00(A0020);
                A0L = JQ0.A0L(C160667Ia.A02(A0020).A30);
                layoutInflater = A0020.A02.A00;
                A0T = JQ0.A0T(A0020, A0L);
                userSession = A00.A00;
                anonymousClass7952 = A00.A01;
                c48926LkY = new C48894Ljl();
                c48871LjN = JQ0.A0R(anonymousClass7952);
                c48847Liv = new C48815LiN(anonymousClass7952);
                li6 = new C48790Lhx(anonymousClass7952);
                A13 = new C1584879i(li6, c48847Liv, c48871LjN, c48926LkY);
                return C1584979j.A00(layoutInflater, viewGroup, A0L, userSession, A13, A00.A02, A00.A03, A0T);
            default:
                ViewGroup viewGroup30 = (ViewGroup) obj;
                C160667Ia A0021 = A00(viewGroup30, this);
                C79S A0022 = C160667Ia.A00(A0021);
                AbstractC66422zJ A0L10 = JQ0.A0L(C160667Ia.A02(A0021).A2v);
                LayoutInflater layoutInflater23 = A0021.A02.A00;
                C7IM A0T2 = JQ0.A0T(A0021, A0L10);
                UserSession userSession7 = A0022.A00;
                AnonymousClass795 anonymousClass7958 = A0022.A01;
                Lk3 lk3 = new Lk3();
                return C1584979j.A00(layoutInflater23, viewGroup30, A0L10, userSession7, new C1584879i(anonymousClass7958.A07, new C48826Lia(anonymousClass7958), JQ0.A0R(anonymousClass7958), lk3), A0022.A02, A0022.A03, A0T2);
        }
    }
}
