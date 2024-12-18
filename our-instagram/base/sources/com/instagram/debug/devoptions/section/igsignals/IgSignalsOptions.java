package com.instagram.debug.devoptions.section.igsignals;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC46292Aq;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.C0YY;
import X.C0eB;
import X.C0f9;
import X.C0fJ;
import X.C14360o3;
import X.GHY;
import X.InterfaceC16660sJ;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes8.dex */
public final class IgSignalsOptions implements DeveloperOptionsSection {
    public static final IgSignalsOptions INSTANCE = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCasperResult(UserSession userSession, final Context context, View view, final long j) {
        AbstractC167007dF.A0J().post(new Runnable() { // from class: com.instagram.debug.devoptions.section.igsignals.IgSignalsOptions$showCasperResult$1
            @Override // java.lang.Runnable
            public final void run() {
                C0fJ.A00(new AlertDialog.Builder(context).setMessage(AnonymousClass001.A0Q("Result is: ", j)).setPositiveButton(2131968948, new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.igsignals.IgSignalsOptions$showCasperResult$1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).create());
            }
        });
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC166987dD.A1J(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.igsignals.IgSignalsOptions$getItems$1

            /* renamed from: com.instagram.debug.devoptions.section.igsignals.IgSignalsOptions$getItems$1$1, reason: invalid class name */
            /* loaded from: classes8.dex */
            public final class AnonymousClass1 extends C0YY implements InterfaceC16660sJ {
                public final /* synthetic */ FragmentActivity $activity;
                public final /* synthetic */ UserSession $userSession;
                public final /* synthetic */ View $v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserSession userSession, FragmentActivity fragmentActivity, View view) {
                    super(1);
                    this.$userSession = userSession;
                    this.$activity = fragmentActivity;
                    this.$v = view;
                }

                public final void invoke(long j) {
                    IgSignalsOptions igSignalsOptions = IgSignalsOptions.INSTANCE;
                    UserSession userSession = this.$userSession;
                    FragmentActivity fragmentActivity = this.$activity;
                    View view = this.$v;
                    C14360o3.A0A(view);
                    igSignalsOptions.showCasperResult(userSession, fragmentActivity, view, j);
                }

                @Override // X.InterfaceC16660sJ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(AbstractC166987dD.A0N(obj));
                    return C0eB.A00;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(284824816);
                IgSignalsCasper A00 = AbstractC46292Aq.A00(fragmentActivity, UserSession.this);
                if (A00 != null) {
                    A00.A03(new AnonymousClass1(UserSession.this, fragmentActivity, view));
                }
                C0f9.A0C(-443901094, A05);
            }
        }, fragmentActivity.getString(2131958143)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958142;
    }
}
