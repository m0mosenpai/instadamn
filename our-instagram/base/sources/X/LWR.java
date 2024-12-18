package X;

import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.google.common.collect.ImmutableMap;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;

/* loaded from: classes8.dex */
public final class LWR implements C2JL {
    public final int A00;
    public final Object A01;
    public final String A02;

    public LWR(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        if (this.A00 != 0) {
            C14360o3.A0B(th, 0);
            C0K8.A0L("NudityModelDownloadManager", "runMantleWithConfigStr callback onFailure for usecase %s", th, this.A02);
        } else {
            DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = (DirectShareSheetFragmentViewModel) this.A01;
            AbstractC35062FcZ.A02(directShareSheetFragmentViewModel.A0M).A00.markerPoint(145755797, "meta_ai_eligibility_and_prompts_fetch_failed");
            DirectShareSheetFragmentViewModel.A05(directShareSheetFragmentViewModel, null, this.A02);
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C60484R0k c60484R0k;
        MantleDataValue mantleDataValue;
        String str;
        if (this.A00 != 0) {
            ImmutableMap immutableMap = (ImmutableMap) obj;
            if (immutableMap != null && immutableMap.containsKey("model_path") && (mantleDataValue = (MantleDataValue) immutableMap.get("model_path")) != null) {
                Object obj2 = mantleDataValue.value;
                if (obj2 != null && mantleDataValue.type == EnumC129705ta.A0B) {
                    str = (String) obj2;
                    if (str == null) {
                        return;
                    }
                } else {
                    str = "";
                }
                if (str.length() != 0) {
                    LFw lFw = (LFw) this.A01;
                    C19L c19l = LFw.A02;
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(lFw.A00);
                    A0w.E7K("odnc_model_downloaded_path", str);
                    A0w.apply();
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
        DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = (DirectShareSheetFragmentViewModel) this.A01;
        AbstractC35062FcZ.A02(directShareSheetFragmentViewModel.A0M).A00.markerPoint(145755797, "meta_ai_eligibility_and_prompts_fetch_success");
        String str2 = this.A02;
        if (anonymousClass436 != null) {
            c60484R0k = (C60484R0k) anonymousClass436.Bos();
        } else {
            c60484R0k = null;
        }
        DirectShareSheetFragmentViewModel.A05(directShareSheetFragmentViewModel, c60484R0k, str2);
    }
}
