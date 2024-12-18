package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.model.reels.Reel;

/* renamed from: X.OgD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55292OgD implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C105814ps A05;
    public final /* synthetic */ Reel A06;
    public final /* synthetic */ C47Z A07;
    public final /* synthetic */ String A08;

    public DialogInterfaceOnClickListenerC55292OgD(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, InterfaceC11380iw interfaceC11380iw2, UserSession userSession, C105814ps c105814ps, Reel reel, C47Z c47z, String str) {
        this.A07 = c47z;
        this.A00 = activity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A06 = reel;
        this.A05 = c105814ps;
        this.A01 = fragment;
        this.A02 = interfaceC11380iw2;
        this.A08 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A07.A3k = null;
        Activity activity = this.A00;
        UserSession userSession = this.A04;
        AbstractC54129NwR.A00(activity, userSession, this.A05, this.A06);
        C9GR.A07(activity, 2131954765);
        ((StoryDraftsCreationViewModel) MSW.A0F(new C8CG(activity, this.A02, userSession), this.A01).A00(StoryDraftsCreationViewModel.class)).A03(this.A08);
    }
}
