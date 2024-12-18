package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.TrackData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class LOy implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public LOy(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        C45842KQx c45842KQx;
        C45068Jwx c45068Jwx;
        TrackData trackData;
        String audioClusterId;
        Integer num;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(830789054);
                C46054Ka9 c46054Ka9 = (C46054Ka9) this.A01;
                Jn4 A0c = AbstractC43592JPx.A0c(c46054Ka9.A0B);
                FragmentActivity requireActivity = c46054Ka9.requireActivity();
                boolean z = this.A02;
                KPK kpk = A0c.A07;
                if (z) {
                    kpk.A05("RESET_PIN_CLICK");
                    kpk.A02();
                } else {
                    kpk.A05("CREATE_PIN_CLICK");
                }
                A0c.A08.A01(requireActivity, AbstractC166987dD.A0b(), EnumC46208Kck.A03, EnumC46149Kbn.A04, C05F.A0u, C05F.A00, null);
                i = 964033587;
                break;
            case 1:
                A05 = C0f9.A05(1492415738);
                boolean z2 = this.A02;
                C45487KCc c45487KCc = (C45487KCc) this.A01;
                if (z2) {
                    InterfaceC09390do interfaceC09390do = c45487KCc.A0i;
                    AbstractC43594JPz.A0V(interfaceC09390do).A0D(EnumC46303KeZ.A0E);
                    ImmutableList immutableList = C55083Oaf.A01;
                    new C55083Oaf(AbstractC166987dD.A0r(interfaceC09390do));
                    C55083Oaf.A00(AbstractC166987dD.A0r(interfaceC09390do), c45487KCc.requireActivity(), "instagram_listening_status");
                } else {
                    Object A01 = Jn3.A01(c45487KCc);
                    if ((A01 instanceof C45842KQx) && (c45842KQx = (C45842KQx) A01) != null && (c45068Jwx = c45842KQx.A07) != null && (trackData = c45068Jwx.A03) != null && (audioClusterId = trackData.getAudioClusterId()) != null) {
                        LXD lxd = new LXD(c45487KCc);
                        ImmutableList immutableList2 = C55083Oaf.A01;
                        InterfaceC09390do interfaceC09390do2 = c45487KCc.A0i;
                        new C55083Oaf(AbstractC166987dD.A0r(interfaceC09390do2)).A02(c45487KCc.requireActivity(), lxd, audioClusterId, String.valueOf(C45487KCc.A00(c45487KCc)));
                        AbstractC43594JPz.A0V(interfaceC09390do2).A0F(EnumC46303KeZ.A0X, null, null, null, AbstractC166997dE.A0b(), AbstractC166997dE.A0a(), AbstractC25228BEl.A13(audioClusterId), null, null, null);
                    }
                }
                i = -2146394120;
                break;
            case 2:
                A05 = C0f9.A05(-1978789086);
                C44505JmB c44505JmB = (C44505JmB) ((C26780Bs3) this.A01).A01.getValue();
                boolean z3 = !this.A02;
                if (z3) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
                C006802i c006802i = c44505JmB.A02;
                if (1 - num.intValue() != 0) {
                    str = "thread_list_unselect_all_click";
                } else {
                    str = "thread_list_select_all_click";
                }
                c006802i.markerPoint(834879336, str);
                C05A c05a = c44505JmB.A03.A07;
                List<C26079Bg8> list = (List) ((C51760Mtj) c05a.getValue()).A02;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (C26079Bg8 c26079Bg8 : list) {
                    C3o9 c3o9 = (C3o9) c26079Bg8.A02;
                    String str3 = c26079Bg8.A04;
                    String str4 = c26079Bg8.A03;
                    AbstractC46437Kgx abstractC46437Kgx = (AbstractC46437Kgx) c26079Bg8.A01;
                    AbstractC167017dG.A1N(c3o9, str3);
                    C14360o3.A0B(abstractC46437Kgx, 3);
                    A0q.add(new C26079Bg8(abstractC46437Kgx, c3o9, str3, str4, z3));
                }
                C51760Mtj c51760Mtj = (C51760Mtj) c05a.getValue();
                c05a.Egh(C51760Mtj.A03((Integer) c51760Mtj.A01, (Integer) c51760Mtj.A00, A0q));
                i = -556306345;
                break;
            default:
                A05 = C0f9.A05(452959824);
                C45479KBr c45479KBr = (C45479KBr) this.A01;
                if (this.A02) {
                    str2 = "https://takeitdown.ncmec.org/";
                } else {
                    str2 = "https://stopncii.org/";
                }
                C45479KBr.A00(c45479KBr, str2);
                i = -424340074;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
