package com.instagram.debug.devoptions.section.newusernux;

import X.AbstractC018607g;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.C0YR;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C17280tP;
import X.C19700xy;
import X.C1V3;
import X.C32269EJe;
import X.C36043Fvf;
import X.C36731GHa;
import X.C3BH;
import X.C41451vu;
import X.EnumC33445EqI;
import X.GHY;
import X.GY7;
import X.InterfaceC16530ry;
import X.InterfaceC41501vz;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class NewUserNuxOptions implements DeveloperOptionsSection {
    public static final NewUserNuxOptions INSTANCE = new Object();

    /* loaded from: classes6.dex */
    public final class OnboardingStatusEventListener implements InterfaceC41501vz {
        public final Context context;

        public OnboardingStatusEventListener(Context context) {
            C14360o3.A0B(context, 1);
            this.context = context;
        }

        public void onEvent(C36043Fvf c36043Fvf) {
            int A0N = AbstractC167017dG.A0N(c36043Fvf, 1210778336);
            AbstractC31175DnJ.A0m(this.context, AnonymousClass001.A0R("Onboarding steps updated:\n\n", c36043Fvf.A00));
            C41451vu.A01.A03(this, C36043Fvf.class);
            C0f9.A0A(-872554896, A0N);
        }

        @Override // X.InterfaceC41501vz
        public /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1488514221);
            onEvent((C36043Fvf) obj);
            C0f9.A0A(-1382473319, A03);
        }
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        ArrayList A1E = AbstractC166987dD.A1E();
        C19700xy c19700xy = C17280tP.A4E;
        C17280tP A00 = c19700xy.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A2Z;
        C0YR[] c0yrArr = C17280tP.A4G;
        A1E.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2Z, C17280tP.A4G, 137, z);
            }
        }, "Run NUX on login", AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 137)));
        C17280tP A002 = c19700xy.A00();
        A1E.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A2Y, C17280tP.A4G, 138, z);
            }
        }, "Run NDX on cold start", AbstractC167017dG.A1b(A002, A002.A2Y, c0yrArr, 138)));
        C17280tP A003 = c19700xy.A00();
        A1E.add(C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C17280tP A0y = AbstractC166987dD.A0y();
                AbstractC167007dF.A1L(A0y, A0y.A35, C17280tP.A4G, 158, z);
            }
        }, 2131958458, AbstractC167017dG.A1b(A003, A003.A35, c0yrArr, 158)));
        GHY.A01(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1544246392);
                C41451vu.A01.A02(new NewUserNuxOptions.OnboardingStatusEventListener(FragmentActivity.this), C36043Fvf.class);
                C1V3 A004 = C3BH.A00();
                FragmentActivity fragmentActivity2 = FragmentActivity.this;
                UserSession userSession2 = userSession;
                A004.A02(fragmentActivity2, userSession2, EnumC33445EqI.A03, AbstractC166987dD.A0x(userSession2).getBoolean("allow_contacts_sync", false), false, true, true, false);
                C0f9.A0C(-1654657204, A05);
            }
        }, "Request NUX Plugin Steps", A1E);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-446332041);
                C1V3 A004 = C3BH.A00();
                final FragmentActivity fragmentActivity2 = FragmentActivity.this;
                A004.A04(fragmentActivity2, userSession, new GY7() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$5.1
                    @Override // X.GY7
                    public final void onFinished() {
                        AbstractC31175DnJ.A0m(FragmentActivity.this, "Nux finished!  Huzzah!");
                    }
                }, EnumC33445EqI.A03, true, true);
                C0f9.A0C(-1837858947, A05);
            }
        }, A1E, 2131958184);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1308369281);
                C1V3 A004 = C3BH.A00();
                final FragmentActivity fragmentActivity2 = FragmentActivity.this;
                A004.A04(fragmentActivity2, userSession, new GY7() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$6.1
                    @Override // X.GY7
                    public final void onFinished() {
                        AbstractC31175DnJ.A0m(FragmentActivity.this, "Nux finished!  Huzzah!");
                    }
                }, EnumC33445EqI.A03, true, false);
                C0f9.A0C(-453314054, A05);
            }
        }, A1E, 2131958186);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-369525755);
                C1V3 A004 = C3BH.A00();
                final FragmentActivity fragmentActivity2 = FragmentActivity.this;
                A004.A04(fragmentActivity2, userSession, new GY7() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$7.1
                    @Override // X.GY7
                    public final void onFinished() {
                        AbstractC31175DnJ.A0m(FragmentActivity.this, "Nux finished!  Huzzah!");
                    }
                }, EnumC33445EqI.A04, true, false);
                C0f9.A0C(-528628936, A05);
            }
        }, A1E, 2131958185);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1296716181);
                C1V3 A004 = C3BH.A00();
                final FragmentActivity fragmentActivity2 = FragmentActivity.this;
                A004.A04(fragmentActivity2, userSession, new GY7() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$8.1
                    @Override // X.GY7
                    public final void onFinished() {
                        AbstractC31175DnJ.A0m(FragmentActivity.this, "Nux finished!  Huzzah!");
                    }
                }, EnumC33445EqI.A07, true, false);
                C0f9.A0C(1826284861, A05);
            }
        }, A1E, 2131958187);
        GHY.A01(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-487424476);
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC31172DnG.A1A();
                C32269EJe c32269EJe = new C32269EJe();
                c32269EJe.setArguments(A0b);
                AbstractC31177DnL.A16(c32269EJe, FragmentActivity.this, userSession);
                C0f9.A0C(-575428042, A05);
            }
        }, "Open NUX Interest Picker", A1E);
        GHY.A01(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions$getItems$10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(521496712);
                C140966Yy A0r = AbstractC25225BEi.A0r(FragmentActivity.this, userSession);
                A0r.A0D(new NuxSelectionFragment());
                A0r.A04();
                C0f9.A0C(-381085643, A05);
            }
        }, "Launch Custom NUX Flow", A1E);
        return A1E;
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958250;
    }
}
