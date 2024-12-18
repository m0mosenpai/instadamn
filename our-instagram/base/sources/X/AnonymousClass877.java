package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.877, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass877 {
    public String A00;
    public final C87A A01;
    public final C87D A02;
    public final C87H A03;
    public final C677733r A04;
    public final AnonymousClass878 A05;
    public final AnonymousClass876 A06;

    public final AnonymousClass879 A02() {
        C87A c87a = this.A01;
        boolean z = c87a.A02;
        InterfaceC150336ph interfaceC150336ph = c87a;
        if (!z) {
            interfaceC150336ph = this.A05;
        }
        return (AnonymousClass879) interfaceC150336ph;
    }

    public AnonymousClass877(Context context, Fragment fragment, UserSession userSession, C677733r c677733r, AnonymousClass876 anonymousClass876) {
        this.A04 = c677733r;
        this.A06 = anonymousClass876;
        this.A05 = new AnonymousClass878(context, userSession, null, c677733r, anonymousClass876);
        this.A01 = new C87A(context, userSession, c677733r);
        FragmentActivity requireActivity = fragment.requireActivity();
        this.A02 = (C87D) new C52942bb(new C87C(userSession, requireActivity), requireActivity).A00(C87D.class);
        C87H A00 = ((C87G) new C52942bb(requireActivity).A00(C87G.class)).A00("post_capture");
        this.A03 = A00;
        A00.A05.A06(fragment, new C87O(new C206899Du(this, 8)));
    }

    public static final void A00(Drawable drawable, AnonymousClass877 anonymousClass877) {
        int i;
        int i2;
        int i3;
        MusicOverlayStickerModel A02 = AbstractC101614hW.A02(drawable);
        anonymousClass877.A00 = A02.A0l;
        AnonymousClass879 A022 = anonymousClass877.A02();
        MusicDataSource A00 = AbstractC23129AMi.A00(A02);
        Integer num = A02.A0K;
        int i4 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = A02.A0O;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        AnonymousClass879 A023 = anonymousClass877.A02();
        if (!C14360o3.A0K(A00, A023.BVb()) || i != A023.BVn() || i2 != A023.BVm()) {
            A022.EZL(AbstractC23129AMi.A00(A02), false);
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            A022.EZP(i3);
            if (num2 != null) {
                i4 = num2.intValue();
            }
            A022.EZO(i4);
        }
        if (!A022.isPlaying()) {
            A022.E4S();
        }
    }

    public static final void A01(AnonymousClass877 anonymousClass877) {
        anonymousClass877.A02().release();
        AnonymousClass876 anonymousClass876 = anonymousClass877.A06;
        if (anonymousClass876 instanceof AnonymousClass875) {
            ((AnonymousClass875) anonymousClass876).A00 = -1;
        }
    }
}
