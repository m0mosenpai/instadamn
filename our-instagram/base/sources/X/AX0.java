package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.List;

/* loaded from: classes4.dex */
public final class AX0 implements InterfaceC150446pt {
    public PickerConfiguration A00;
    public InterfaceC25157BBb A01;
    public A50 A02;
    public ShutterButton A03;
    public boolean A04;
    public final View A05;
    public final C24165Ano A06;
    public final C69574Vrd A07;
    public final C22975AAz A08;
    public final C23759AfW A09;
    public final C88M A0A;
    public final C88H A0B;
    public final C8I4 A0C;
    public final List A0D;
    public final Context A0E;

    public AX0(Context context, View view, C69574Vrd c69574Vrd, C22975AAz c22975AAz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(userSession, 1);
        AbstractC167017dG.A1S(view, c22975AAz);
        this.A0E = context;
        this.A05 = view;
        this.A08 = c22975AAz;
        this.A07 = c69574Vrd;
        this.A09 = new C23759AfW(view, userSession, targetViewSizeProvider);
        this.A06 = new C24165Ano(this);
        this.A0C = C24167Anq.A00;
        ShutterButton shutterButton = (ShutterButton) this.A05.requireViewById(R.id.camera_shutter_button);
        this.A03 = shutterButton;
        if (shutterButton == null) {
            C14360o3.A0F("shutterButton");
            throw C00O.createAndThrow();
        }
        shutterButton.setOnSingleTapCaptureListener(new C24169Ans(this, 0));
        shutterButton.setOnRecordVideoListener(this.A06);
        shutterButton.A0D = this.A0C;
        shutterButton.A08 = 15000L;
        shutterButton.setShutterButtonRecordingStyle(shutterButton.A0j);
        shutterButton.setVisibility(8);
        this.A0A = new C88M(context, interfaceC11380iw, userSession, new C23751AfO(this, 0));
        this.A0B = new C23758AfV();
        this.A0D = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC150446pt
    public final void DYd(PickerConfiguration pickerConfiguration, String str) {
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        List list = this.A0D;
        list.clear();
        if (pickerConfiguration != null && (itemConfigurationArr = pickerConfiguration.mItems) != null) {
            for (PickerConfiguration.ItemConfiguration itemConfiguration : itemConfigurationArr) {
                AbstractC167007dF.A1C(itemConfiguration);
                list.add(new C88X(new C189128Zd(null, null, C88Z.A0g, new SimpleImageUrl(itemConfiguration.mImageUri), null, null, "", null)));
            }
        }
        this.A00 = pickerConfiguration;
        if (!list.isEmpty()) {
            C88M c88m = this.A0A;
            if (c88m.isEmpty()) {
                this.A09.EVD(false);
                c88m.A06(list);
            }
            C0fA.A00(c88m, -944874659);
            C23759AfW c23759AfW = this.A09;
            c23759AfW.AJ8(c88m, this.A0B);
            c23759AfW.EVD(true);
            this.A04 = false;
        }
    }

    @Override // X.InterfaceC150446pt
    public final void DYe() {
        C23759AfW c23759AfW = this.A09;
        if (AbstractC167007dF.A1W(c23759AfW.A07)) {
            c23759AfW.E5s();
            c23759AfW.FBj(0.0f);
        }
        ShutterButton shutterButton = this.A03;
        if (shutterButton == null) {
            C14360o3.A0F("shutterButton");
            throw C00O.createAndThrow();
        }
        shutterButton.setVisibility(8);
    }

    @Override // X.InterfaceC150446pt
    public final void DYf(String str, int i) {
        this.A0A.A03(i);
    }

    @Override // X.InterfaceC150446pt
    public final void DYg(InterfaceC25157BBb interfaceC25157BBb, String str) {
        C23759AfW c23759AfW = this.A09;
        c23759AfW.E5t();
        c23759AfW.FBj(1.0f);
        C88M c88m = c23759AfW.A08;
        if (c88m != null) {
            c88m.A01();
        }
        if (!this.A04) {
            PickerConfiguration pickerConfiguration = this.A00;
            if (pickerConfiguration != null) {
                this.A0A.A03(pickerConfiguration.mSelectedIndex);
            }
            this.A04 = true;
        }
        this.A01 = interfaceC25157BBb;
        ShutterButton shutterButton = this.A03;
        if (shutterButton == null) {
            C14360o3.A0F("shutterButton");
            throw C00O.createAndThrow();
        }
        shutterButton.setVisibility(0);
    }
}
