package X;

import android.content.Context;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LXm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48263LXm implements InterfaceC11380iw, InterfaceC189018Yr, InterfaceC188988Yo {
    public static final String __redex_internal_original_name = "AlbumPickerFolderProvider";
    public C189058Yv A00;
    public boolean A01;
    public final C58252li A02;
    public final UserSession A03;
    public final boolean A04;
    public final Context A05;
    public final InterfaceC28041Xi A06;
    public final C60322pF A07;
    public final String A08;

    @Override // X.InterfaceC189018Yr
    public final boolean AFb(Folder folder, List list) {
        return true;
    }

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
    }

    @Override // X.InterfaceC189018Yr
    public final void Dr0(List list) {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2pI, java.lang.Object] */
    public C48263LXm(Context context, AbstractC018607g abstractC018607g, EnumC188968Ym enumC188968Ym, UserSession userSession, C2AH c2ah, C60322pF c60322pF, Integer num, boolean z) {
        int dimensionPixelOffset;
        EnumC188968Ym enumC188968Ym2;
        AbstractC018607g abstractC018607g2 = abstractC018607g;
        AbstractC167007dF.A1D(context, 1, userSession);
        this.A05 = context;
        this.A03 = userSession;
        this.A07 = c60322pF;
        this.A04 = z;
        C58252li c58252li = new C58252li();
        this.A02 = c58252li;
        this.A06 = LWF.A00;
        this.A01 = true;
        if (num != null) {
            dimensionPixelOffset = num.intValue();
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.album_thumbnail_image_size);
        }
        C188958Yl c188958Yl = new C188958Yl(abstractC018607g == null ? AbstractC018607g.A00((ComponentActivity) context) : abstractC018607g2, new C8SF(context, userSession, C05F.A00, dimensionPixelOffset, dimensionPixelOffset, false));
        c188958Yl.A07 = this;
        c188958Yl.A04 = userSession;
        c188958Yl.A0B = true;
        c188958Yl.A0D = true;
        c188958Yl.A09 = true;
        c188958Yl.A02 = new C48281LYe(0);
        if (z) {
            enumC188968Ym2 = EnumC188968Ym.A04;
        } else {
            enumC188968Ym2 = EnumC188968Ym.A02;
        }
        c188958Yl.A03 = enumC188968Ym2;
        if (new Object().A00(userSession)) {
            c188958Yl.A08 = this;
            c188958Yl.A06 = c60322pF;
            c188958Yl.A0C = true;
        }
        if (enumC188968Ym != null && C18U.A06(C06090Tz.A05, userSession, 2342163254124748978L)) {
            c188958Yl.A03 = enumC188968Ym;
        }
        c188958Yl.A01 = new C189038Yt(userSession, dimensionPixelOffset);
        C189058Yv c189058Yv = new C189058Yv(context, c2ah, null, new C189028Ys(c188958Yl));
        this.A00 = c189058Yv;
        c189058Yv.A0A(Integer.MAX_VALUE);
        c58252li.A0E(AbstractC31172DnG.A0E(AbstractC195438kj.A00(userSession).A06), new C65991Txk(16, new C50260MHp(this, 38)));
        this.A08 = "album_picker_folder_provider";
    }

    public static final List A00(C48263LXm c48263LXm) {
        ArrayList A04 = c48263LXm.A00.A04();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c48263LXm.A06.apply(next)) {
                A1E.add(next);
            }
        }
        return A1E;
    }

    public static final List A01(C48263LXm c48263LXm) {
        ArrayList A05 = c48263LXm.A00.A05();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c48263LXm.A06.apply(next)) {
                A1E.add(next);
            }
        }
        return A1E;
    }

    public final void A03() {
        this.A00.A0A(Integer.MAX_VALUE);
        if (this.A01) {
            UserSession userSession = this.A03;
            if (C18U.A06(C06090Tz.A05, userSession, 36316645727146553L)) {
                AbstractC195438kj.A00(userSession).A03("album_picker");
            }
        }
    }

    @Override // X.InterfaceC189018Yr
    public final List C3y(Integer num) {
        ComponentActivity componentActivity;
        Context context = this.A05;
        if (context instanceof FragmentActivity) {
            componentActivity = (ComponentActivity) context;
        } else {
            componentActivity = null;
        }
        if (componentActivity != null) {
            C07Y.A00(componentActivity);
            try {
                return AbstractC43895Jb5.A00(context, this.A03, this.A07).A00(new C51755Mte(AbstractC166987dD.A1J(EnumC222729sD.A05), 27));
            } catch (IllegalStateException unused) {
                return C16930sl.A00;
            }
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        this.A02.A0B(A02());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    public final ArrayList A02() {
        List list;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(A00(this));
        if (this.A01) {
            UserSession userSession = this.A03;
            if (C18U.A06(C06090Tz.A05, userSession, 36316645727146553L)) {
                list = C9KQ.A01((List) AbstractC195438kj.A00(userSession).A06.getValue());
                A1E.addAll(list);
                A1E.addAll(A01(this));
                return A1E;
            }
        }
        list = C16930sl.A00;
        A1E.addAll(list);
        A1E.addAll(A01(this));
        return A1E;
    }
}
