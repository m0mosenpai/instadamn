package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TQD implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C64455TEr A01;
    public final /* synthetic */ List A02;

    public TQD(View view, C64455TEr c64455TEr, List list) {
        this.A01 = c64455TEr;
        this.A00 = view;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64455TEr c64455TEr = this.A01;
        if (c64455TEr.A00 == null) {
            c64455TEr.A00 = (InstantExperiencesSaveAutofillDialog) AbstractC31173DnH.A0E(AbstractC31173DnH.A0G(this.A00, R.id.instant_experiences_save_autofill_dialog), R.layout.instant_experiences_autofill_save_dialog);
        }
        List list = this.A02;
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1H.addAll(((FbAutofillData) it.next()).AeG().keySet());
        }
        Object[] array = A1H.toArray(new String[A1H.size()]);
        Arrays.sort(array);
        TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, array);
        InstantExperiencesSaveAutofillDialog instantExperiencesSaveAutofillDialog = c64455TEr.A00;
        SCH sch = new SCH(this);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0q.add(((BrowserExtensionsAutofillData) ((FbAutofillData) it2.next())).A00());
        }
        instantExperiencesSaveAutofillDialog.setDetailItems(A0q);
        instantExperiencesSaveAutofillDialog.A02 = sch;
        c64455TEr.A02.A00(true);
    }
}
