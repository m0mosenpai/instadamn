package X;

import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class EUI extends C1P1 {
    public final /* synthetic */ HDI A00;

    public EUI(HDI hdi) {
        this.A00 = hdi;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        int A03 = C0f9.A03(1963320633);
        C14360o3.A0B(abstractC115105If, 0);
        Object A00 = abstractC115105If.A00();
        String str6 = "";
        String str7 = null;
        if (A00 == null) {
            str = "";
        } else {
            C40781ul c40781ul = (C40781ul) A00;
            if (c40781ul != null) {
                str = c40781ul.getErrorMessage();
            } else {
                str = null;
            }
        }
        HDI hdi = this.A00;
        C69613Av c69613Av = hdi.A01;
        if (c69613Av != null) {
            c69613Av.A07(str);
        }
        if (A00 != null && C14360o3.A0K(str, AbstractC43591JPw.A00(1012))) {
            EDT edt = (EDT) A00;
            if (edt != null) {
                str2 = edt.A07;
                str3 = edt.A02;
                str4 = edt.A06;
                str5 = edt.A01;
                str7 = edt.A04;
            } else {
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            FragmentActivity requireActivity = hdi.requireActivity();
            InterfaceC09390do interfaceC09390do = hdi.A0K;
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
            HashMap A1G = AbstractC166987dD.A1G();
            if (str7 == null) {
                str7 = "";
            }
            A1G.put("media_id", str7);
            if (str2 == null) {
                str2 = "";
            }
            A1G.put(DialogModule.KEY_TITLE, str2);
            if (str3 == null) {
                str3 = "";
            }
            A1G.put(DevServerEntity.COLUMN_DESCRIPTION, str3);
            if (str4 == null) {
                str4 = "";
            }
            A1G.put(AbstractC31192Dnb.A00(42, 10, 38), str4);
            if (str5 == null) {
                str5 = "";
            }
            A1G.put(AbstractC58317Pt9.A00(19), str5);
            if (hdi.getActivity() != null) {
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                C14360o3.A0B(A0o, 1);
                C006802i.A0p.markerStart(291191452, 0);
                C006802i.A0p.markerAnnotate(291191452, "analytics_module", "ShortURLFeedFragment");
                C66277U6x A01 = C66277U6x.A01("com.bloks.www.instagram.igwb.exp.geogating_viewer", A1G);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A0o);
                A0C.A0U = "";
                A0C.A03 = C32376EOc.A00;
                C72743Nv A02 = W6d.A02(A0C, A01);
                A0c.A0C(hdi);
                A0c.A0D(A02);
                A0c.A04();
            }
            i = -162120685;
        } else {
            if (hdi.isVisible()) {
                AbstractC167007dF.A0x(hdi.A0W());
                FragmentActivity requireActivity2 = hdi.requireActivity();
                String string = hdi.requireArguments().getString(AbstractC111324zv.A00(103));
                if (string != null) {
                    str6 = string;
                }
                android.net.Uri A0B = AbstractC25227BEk.A0B(str6);
                List<String> pathSegments = A0B.getPathSegments();
                if (pathSegments.size() == 3) {
                    String A1I = AbstractC25226BEj.A1I(pathSegments, 0);
                    C14360o3.A0A(A1I);
                    hdi.A0I.post(new GP2(hdi, A1I));
                    C146106i8 A0j = AbstractC25229BEm.A0j();
                    A0j.A0H = "short_url_feed_post_unavailable";
                    AbstractC25226BEj.A1N(hdi.requireContext(), A0j, 2131969844);
                    A0j.A06();
                    AbstractC25233BEq.A1F(A0j);
                } else {
                    AbstractC35275FhA.A02(requireActivity2, A0B, AbstractC166987dD.A0o(hdi.A0K), "feed_short_url");
                    if (!requireActivity2.isFinishing()) {
                        requireActivity2.finish();
                    }
                }
            }
            i = -999274445;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1796914417);
        HDI hdi = this.A00;
        hdi.A0A = false;
        if (hdi.A0W() != null) {
            ListView A0W = hdi.A0W();
            C14360o3.A0C(A0W, MSV.A00(16));
            ((RefreshableListView) A0W).setIsLoading(false);
        }
        C0f9.A0A(487373149, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1495861137);
        HDI hdi = this.A00;
        hdi.A0A = true;
        if (hdi.A0W() != null) {
            ListView A0W = hdi.A0W();
            C14360o3.A0C(A0W, MSV.A00(16));
            ((RefreshableListView) A0W).setIsLoading(true);
        }
        C0f9.A0A(-50677479, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-28222499);
        EDT edt = (EDT) obj;
        int A0N = AbstractC167017dG.A0N(edt, -1447835894);
        HDI hdi = this.A00;
        C69613Av c69613Av = hdi.A01;
        if (c69613Av != null) {
            c69613Av.A05();
        }
        if (edt.A08) {
            String str = edt.A03;
            if (str == null) {
                str = "";
            }
            hdi.A08 = str;
            HDI.A02(hdi);
        } else {
            hdi.A0I.post(new GP2(hdi, edt.A00));
        }
        C0f9.A0A(1350490831, A0N);
        C0f9.A0A(154723024, A03);
    }
}
