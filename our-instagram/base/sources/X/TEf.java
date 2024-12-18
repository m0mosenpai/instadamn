package X;

import android.content.Context;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TEf implements InterfaceC65447TkJ {
    public boolean A00;
    public final Context A01;
    public final Map A02 = AbstractC166987dD.A1I();

    @Override // X.InterfaceC65447TkJ
    public final void FDB(SO9 so9, Long l, String str, String str2, List list) {
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        synchronized (this) {
            this.A02.clear();
            this.A00 = A1Y;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51u c51u = (C51u) it.next();
            String str3 = (String) c51u.A00;
            File file = (File) c51u.A01;
            String str4 = (String) c51u.A02;
            C62969SZm c62969SZm = new C62969SZm();
            c62969SZm.A03 = "authenticity_uploads";
            c62969SZm.A01 = C05F.A01;
            c62969SZm.A02(SSZ.class);
            c62969SZm.A02 = "124024574287414|84a456d620314b6e92a16d8ff1c792dc";
            if (str2 != null && !AbstractC001900j.A0T(str2)) {
                c62969SZm.A04.A05("id_or_cuid", str2);
            }
            if (l != null && l.longValue() != 0) {
                c62969SZm.A04.A05("submission_id", l.toString());
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(MSX.A0i(file)));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "image/jpeg";
            }
            C1Ee c1Ee = c62969SZm.A04;
            c1Ee.A00.put("upload1", new TFC(file, mimeTypeFromExtension));
            c1Ee.A05("upload_medium", str4);
            Context context = this.A01;
            c1Ee.A05(AbstractC50529MSi.A02(A1Y ? 1 : 0, 9, 30), C16030qx.A00(context));
            c1Ee.A05("machine_id", C16030qx.A02.A05(context));
            c1Ee.A05("product", str);
            c1Ee.A05(AbstractC50529MSi.A01(), "session_id_unused");
            c1Ee.A05("return_file_handles", "true");
            c1Ee.A05("submit_to_authenticity_platform", "false");
            C1ON A01 = c62969SZm.A01();
            A01.A00 = new C32520ETw(this, so9, str3, list.size(), A1Y ? 1 : 0);
            C1GJ.A03(A01);
        }
    }

    public TEf(Context context) {
        this.A01 = context;
    }
}
