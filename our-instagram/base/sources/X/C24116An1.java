package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.TrackSnippet;
import java.util.Iterator;

/* renamed from: X.An1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24116An1 implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public C24116An1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C189988bH c189988bH;
        switch (this.A00) {
            case 0:
                C47809L9r c47809L9r = (C47809L9r) this.A01;
                C189448aO c189448aO = c47809L9r.A03;
                if (c189448aO != null) {
                    c189448aO.A0T = null;
                }
                c47809L9r.A02 = null;
                return;
            case 1:
                C23885Ahe c23885Ahe = (C23885Ahe) ((C8YY) this.A01).A0l.getValue();
                AudioOverlayTrack audioOverlayTrack = c23885Ahe.A01;
                if (audioOverlayTrack == null) {
                    return;
                }
                C23885Ahe.A00(c23885Ahe, audioOverlayTrack, false);
                return;
            case 2:
                return;
            case 3:
                C23885Ahe c23885Ahe2 = (C23885Ahe) this.A01;
                if (!c23885Ahe2.A03) {
                    return;
                }
                c23885Ahe2.A01();
                return;
            case 4:
                AAU aau = (AAU) this.A01;
                aau.A02 = false;
                A61 a61 = aau.A08;
                int i = aau.A00;
                c189988bH = a61.A00;
                int i2 = i * 1000;
                Iterator it = c189988bH.A10.A02.iterator();
                while (it.hasNext()) {
                    ((BE3) it.next()).DnB(i2);
                }
                TrackSnippet trackSnippet = c189988bH.A0Q;
                if (trackSnippet != null) {
                    trackSnippet.A00 = i2;
                }
                c189988bH.A0y.Dx9(i2);
                AnonymousClass879 anonymousClass879 = c189988bH.A0b;
                if (anonymousClass879 != null) {
                    anonymousClass879.EZO(i2);
                }
                AMp aMp = c189988bH.A0Z;
                if (aMp != null) {
                    AMp.A05(aMp);
                }
                c189988bH.A0H();
                return;
            default:
                c189988bH = ((AMp) this.A01).A0J;
                c189988bH.A0H();
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        switch (this.A00) {
            case 0:
                try {
                    C189478aR c189478aR = ((C47809L9r) this.A01).A02;
                    if (c189478aR == null) {
                        return;
                    }
                    c189478aR.A05();
                    return;
                } catch (IllegalStateException e) {
                    AbstractC12120kG.A07("AlbumPicker", "exception when clearing BottomSheet back stack", e);
                    return;
                }
            case 1:
            default:
                return;
            case 2:
                C448424o c448424o = AnonymousClass229.A01(((C8JN) this.A01).A08).A0C;
                EnumC114925Hg enumC114925Hg = EnumC114925Hg.STORY;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448424o.A01, "ig_camera_nux");
                if (!A0f.isSampled()) {
                    return;
                }
                A0f.AAP("entity", "GLASSES_CAMERA");
                A0f.AAP("nux_step", MSV.A00(320));
                C22M c22m = c448424o.A04;
                String str = c22m.A0L;
                if (str == null) {
                    str = "";
                }
                AbstractC166987dD.A1S(A0f, str);
                A0f.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0f.A8R(enumC114925Hg, "camera_destination");
                A0f.Cht();
                return;
        }
    }
}
