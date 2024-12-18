package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.P5v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56481P5v implements JHD {
    public final int A00;
    public final Object A01;

    public C56481P5v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JHD
    public final void DBj(MusicAssetModel musicAssetModel) {
        int i = this.A00;
        C14360o3.A0B(musicAssetModel, 0);
        if (i != 0) {
            C45484KBy c45484KBy = (C45484KBy) this.A01;
            SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
            A01.append((CharSequence) musicAssetModel.A0I);
            A01.append((CharSequence) " • ");
            A01.append((CharSequence) musicAssetModel.A0D);
            TextView textView = c45484KBy.A00;
            if (textView == null) {
                C14360o3.A0F("audioAttributionText");
                throw C00O.createAndThrow();
            }
            textView.setText(A01);
            return;
        }
        OJI oji = (OJI) this.A01;
        oji.A03.A00(musicAssetModel);
        oji.A00();
    }

    @Override // X.JHD
    public final void DBk() {
        if (this.A00 != 0) {
            C0w9.A03(C45484KBy.__redex_internal_original_name, "Unable to download music asset model for clip preview.");
        } else {
            ((OJI) this.A01).A02.DUI("download music asset failed");
        }
    }
}
