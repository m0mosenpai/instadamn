package X;

import android.content.Context;
import android.view.ViewGroup;
import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class JnZ extends C2UU {
    public List A00 = C16930sl.A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        Long A0j;
        C44612JpI c44612JpI = (C44612JpI) c3oo;
        C14360o3.A0B(c44612JpI, 0);
        OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) this.A00.get(i);
        IgdsListCell igdsListCell = c44612JpI.A00;
        igdsListCell.A05(R.drawable.instagram_device_phone_pano_outline_24);
        Context A05 = AbstractC31172DnG.A05(c44612JpI);
        String str = oneTimeCodeDevice.A01;
        if (str == null) {
            str = oneTimeCodeDevice.A00;
        }
        igdsListCell.A0I(str);
        C14360o3.A0A(A05);
        String str2 = oneTimeCodeDevice.A02;
        String str3 = null;
        if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
            str3 = C23831Eq.A03(A05, A0j.longValue());
        }
        List A13 = AbstractC43592JPx.A13(str3, oneTimeCodeDevice.A03);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A13) {
            String str4 = (String) obj;
            if (str4 != null && !AbstractC001900j.A0T(str4)) {
                A1E.add(obj);
            }
        }
        igdsListCell.A0H(AbstractC31175DnJ.A0a(" • ", A1E));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1139896456);
        int size = this.A00.size();
        C0f9.A0A(1351761601, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44612JpI(new IgdsListCell(AbstractC31176DnK.A04(viewGroup), null));
    }
}
