package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt", f = "UiState.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {304, 310, 319, 321, 323}, m = "toUiState", n = {"$this$toUiState", "settingsSession", "modelFactory", "$this$toUiState", "settingsSession", "modelFactory", "$this$toUiState", "settingsSession", IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "stateCode", "inProgressValue", "$this$toUiState", "settingsSession", IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "stateCode", "inProgressValue", "headerValue", "optionsValue", "accessibilityLabelValue", "bannerValue", "enabledValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0"})
/* renamed from: X.PWd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57132PWd extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public /* synthetic */ Object A0B;

    public C57132PWd(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0B = obj;
        this.A00 |= Integer.MIN_VALUE;
        return UiStateKt.A05(null, null, null, this);
    }
}
