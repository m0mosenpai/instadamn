package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PQT implements Runnable {
    public final /* synthetic */ ClipsCoverPhotoPickerController A00;
    public final /* synthetic */ C115595Kt A01;

    public PQT(ClipsCoverPhotoPickerController clipsCoverPhotoPickerController, C115595Kt c115595Kt) {
        this.A00 = clipsCoverPhotoPickerController;
        this.A01 = c115595Kt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = this.A00;
        if (clipsCoverPhotoPickerController.filmStripFramesContainer != null) {
            List A01 = this.A01.A01();
            ArrayList<C115475Kh> A1E = AbstractC166987dD.A1E();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                MSZ.A1T(A1E, it);
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            for (C115475Kh c115475Kh : A1E) {
                long A05 = MSW.A05(c115475Kh);
                String str2 = c115475Kh.A0G.A0F;
                int abs = (int) (Math.abs(c115475Kh.A00) * 100.0f);
                if (AbstractC115515Kl.A05(c115475Kh)) {
                    str = c115475Kh.A0G.A0I;
                } else {
                    str = null;
                }
                A0q.add(new C54630OBf(A05, str2, abs, str));
            }
            LinearLayout linearLayout = clipsCoverPhotoPickerController.filmStripFramesContainer;
            if (linearLayout != null) {
                int width = linearLayout.getWidth();
                int i = clipsCoverPhotoPickerController.A05;
                int i2 = (width / i) + 1;
                Context context = clipsCoverPhotoPickerController.A06;
                UserSession userSession = clipsCoverPhotoPickerController.A09;
                AbstractC59962oe abstractC59962oe = clipsCoverPhotoPickerController.A08;
                OEB oeb = clipsCoverPhotoPickerController.A0D.A0E;
                C14360o3.A0B(oeb, 0);
                OEB oeb2 = new OEB(oeb.A05, null, oeb.A02, oeb.A01, -1, oeb.A03);
                int i3 = clipsCoverPhotoPickerController.A04;
                OYA.A01(context, abstractC59962oe, userSession, null, oeb2, "post_capture", A0q, i2, i, i3);
                for (int i4 = 0; i4 < i2; i4++) {
                    ImageView imageView = new ImageView(context);
                    AbstractC43592JPx.A1H(imageView, i, i3);
                    imageView.setPadding(0, 0, 0, 0);
                    LinearLayout linearLayout2 = clipsCoverPhotoPickerController.filmStripFramesContainer;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(imageView);
                    }
                }
                AbstractC43593JPy.A1E(abstractC59962oe, ((C87G) AbstractC31175DnJ.A0A(abstractC59962oe).A00(C87G.class)).A01("post_capture").A06, new C57749Pjc(clipsCoverPhotoPickerController, 4), 23);
                return;
            }
            C14360o3.A0F("filmStripFramesContainer");
            throw C00O.createAndThrow();
        }
    }
}
