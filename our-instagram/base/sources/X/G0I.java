package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class G0I implements XCU {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ DirectShareSheetFragment A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public G0I(ImageUrl imageUrl, DirectShareSheetFragment directShareSheetFragment, String str, String str2, String str3) {
        this.A01 = directShareSheetFragment;
        this.A00 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        C9GR.A08(this.A01.requireActivity(), 2131976159, 0);
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String absolutePath;
        File file = (File) obj;
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(2087), this.A00);
        A0b.putString(AbstractC111324zv.A00(1983), this.A02);
        DirectShareSheetFragment directShareSheetFragment = this.A01;
        int A0K = AbstractC167017dG.A0K(directShareSheetFragment.A0m.A0E);
        String A00 = AbstractC111324zv.A00(2085);
        A0b.putInt(A00, A0K);
        A0b.putInt(A00, directShareSheetFragment.A08);
        A0b.putString(AbstractC111324zv.A00(1967), absolutePath);
        A0b.putString("collection_name", directShareSheetFragment.A0m.A0G);
        A0b.putString("collection_id", directShareSheetFragment.A0m.A0F);
        A0b.putString("cover_media_id", this.A03);
        A0b.putString(AbstractC111324zv.A00(2090), this.A04);
        AbstractC31172DnG.A1M(directShareSheetFragment, C6XJ.A02(directShareSheetFragment.requireActivity(), A0b, directShareSheetFragment.A0H, TransparentModalActivity.class, AbstractC111324zv.A00(1197)));
    }
}
