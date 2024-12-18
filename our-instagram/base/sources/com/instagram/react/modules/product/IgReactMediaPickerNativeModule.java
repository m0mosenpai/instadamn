package com.instagram.react.modules.product;

import X.AbstractC166987dD;
import X.AbstractC25651Mw;
import X.AbstractC31173DnH;
import X.AbstractC50666MYj;
import X.AbstractC58321PtD;
import X.AbstractC69933Cc;
import X.C0fJ;
import X.C193328hC;
import X.C25671My;
import X.C55986OtJ;
import X.C56324Ozl;
import X.C64473TFj;
import X.C69963Cf;
import X.DialogInterfaceOnClickListenerC63421Sjz;
import X.InterfaceC41501vz;
import X.InterfaceC69973Cg;
import X.R3M;
import android.app.Activity;
import android.content.Context;
import com.facebook.fbreact.specs.NativeIGMediaPickerReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

@ReactModule(name = "IGMediaPickerNativeModule")
/* loaded from: classes10.dex */
public class IgReactMediaPickerNativeModule extends NativeIGMediaPickerReactModuleSpec {
    public static final String HEIGHT = "height";
    public static final String IG_MEDIA_PICKER_PHOTO_SELECTED = "IGMediaPickerPhotoSelected";
    public static final String MODULE_NAME = "IGMediaPickerNativeModule";
    public static final String URI = "uri";
    public static final String WIDTH = "width";
    public InterfaceC69973Cg mCaptureFlowHelper;
    public C25671My mIgEventBus;
    public final InterfaceC41501vz mImageSelectedEventListener;
    public CharSequence[] mOptions;

    @Override // com.facebook.fbreact.specs.NativeIGMediaPickerReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGMediaPickerNativeModule";
    }

    public boolean matches(Context context, int i, int i2) {
        return this.mOptions[i].equals(context.getString(i2));
    }

    private void removeListener() {
        this.mIgEventBus.A02(this.mImageSelectedEventListener, C55986OtJ.class);
    }

    private void stopCaptureFlow() {
        AbstractC50666MYj.A00(((C69963Cf) this.mCaptureFlowHelper).A04).A09(null, 6);
    }

    public IgReactMediaPickerNativeModule(R3M r3m, UserSession userSession) {
        super(r3m);
        this.mImageSelectedEventListener = new C64473TFj(this, 7);
        this.mIgEventBus = AbstractC25651Mw.A00(userSession);
        this.mCaptureFlowHelper = AbstractC69933Cc.A00(r3m, userSession, new C56324Ozl(this, 0));
    }

    private CharSequence[] getOptions(Context context, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z) {
            AbstractC31173DnH.A17(context, A1E, 2131971507);
        }
        AbstractC31173DnH.A17(context, A1E, 2131971508);
        AbstractC31173DnH.A17(context, A1E, 2131971506);
        CharSequence[] charSequenceArr = new CharSequence[A1E.size()];
        this.mOptions = charSequenceArr;
        A1E.toArray(charSequenceArr);
        return this.mOptions;
    }

    public void onEventCleanup() {
        removeListener();
        stopCaptureFlow();
    }

    @Override // com.facebook.fbreact.specs.NativeIGMediaPickerReactModuleSpec
    public void openNativePhotoPicker(double d, boolean z) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        A01.getClass();
        A01.getIntent().getClass();
        AbstractC31173DnH.A0A(A01).getClass();
        DialogInterfaceOnClickListenerC63421Sjz dialogInterfaceOnClickListenerC63421Sjz = new DialogInterfaceOnClickListenerC63421Sjz(4, A01, this);
        C193328hC c193328hC = new C193328hC(A01);
        c193328hC.A0f(dialogInterfaceOnClickListenerC63421Sjz, getOptions(A01, z));
        c193328hC.A04();
        C0fJ.A00(c193328hC.A02());
    }
}
