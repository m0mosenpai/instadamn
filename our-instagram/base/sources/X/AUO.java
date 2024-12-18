package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class AUO implements InterfaceC58362lv {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ List A01;

    public AUO(C8JT c8jt, List list) {
        this.A00 = c8jt;
        this.A01 = list;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C38321qM A02;
        C6WQ c6wq;
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        C8JT c8jt = this.A00;
        A5G a5g = c8jt.A09;
        if (a5g != null && (c6wq = a5g.A00) != null) {
            c6wq.dismiss();
        }
        boolean z = true;
        if (!list.isEmpty()) {
            List list2 = this.A01;
            String str = "";
            if (list2 != null) {
                try {
                    if (!list2.isEmpty() && (A02 = C1DW.A00(c8jt.A1D).A02((String) AbstractC001800i.A0O(list2, 0))) != null) {
                        String A2u = A02.A2u();
                        if (A2u != null) {
                            str = A2u;
                        }
                    }
                } catch (IOException unused) {
                    str = "IOExceptionID";
                }
            }
            C8A7 c8a7 = c8jt.A1o;
            String str2 = c8jt.A0R;
            if (str2 == null) {
                str2 = str;
            }
            ACRType aCRType = c8jt.A19;
            AudioOverlayTrack audioOverlayTrack = c8jt.A1z;
            boolean z2 = false;
            if (list2 != null) {
                if (c8jt.A16 != C22P.A4c || list2.size() <= 1) {
                    z = false;
                }
                z2 = z;
            }
            c8a7.A06.A0B(new C8A8(new C8A9(aCRType, audioOverlayTrack, str2, list, null, 898, z2, true, false)));
        }
    }
}
