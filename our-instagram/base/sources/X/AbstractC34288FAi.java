package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.FAi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34288FAi {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgdsFaceSwarm igdsFaceSwarm) {
        int i;
        int i2;
        C9C2 c9c2;
        C14360o3.A0B(igdsFaceSwarm, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        int A00 = AbstractC35071Fci.A00(userSession, A1E);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            User user = (User) next;
            if (i3 < A00) {
                if (i3 < 4) {
                    c9c2 = new C9C2((Drawable) AbstractC35071Fci.A01(context, user.Bhu(), interfaceC11380iw.getModuleName()), (ImageUrl) null, (String) null, 5);
                    A1E2.add(c9c2);
                    i3 = i4;
                } else {
                    i3 = i4;
                }
            } else if (i3 >= 4) {
                i3 = i4;
            } else {
                c9c2 = new C9C2((Drawable) null, user.Bhu(), (String) null, 6);
                A1E2.add(c9c2);
                i3 = i4;
            }
        }
        if (A1E2.size() < 2) {
            A1E2.add(new C9C2(igdsFaceSwarm.getContext().getDrawable(R.drawable.reel_item_new_group_story_icon), (ImageUrl) null, (String) null, 5));
        }
        if (A1E2.size() == 1) {
            i = 74;
            int dimensionPixelSize = AbstractC25228BEl.A0M(igdsFaceSwarm).getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            igdsFaceSwarm.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            i = 90;
            int A04 = AbstractC167017dG.A04(igdsFaceSwarm.getContext());
            igdsFaceSwarm.setPadding(0, A04, 0, A04);
        }
        igdsFaceSwarm.setBackgroundCircleColor(0);
        igdsFaceSwarm.setCustomSizeDp(i);
        igdsFaceSwarm.A08 = false;
        if (A1E.size() <= 2) {
            i2 = -85;
        } else {
            i2 = -55;
            if (A1E.size() == 3) {
                i2 = -75;
            }
        }
        igdsFaceSwarm.A04 = i2;
        igdsFaceSwarm.setFaceSwarmItems(A1E2, interfaceC11380iw);
    }
}
