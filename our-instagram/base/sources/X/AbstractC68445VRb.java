package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.business.promote.model.IGBoostPackage;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68445VRb {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.business.promote.model.IGBoostPackagesFlowInfo, java.lang.Object] */
    public static IGBoostPackagesFlowInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("destination".equals(A0s)) {
                    obj.A00 = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("audience".equals(A0s)) {
                    obj.A01 = AbstractC68447VRd.parseFromJson(c16l);
                } else if ("packages".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            IGBoostPackage parseFromJson = AbstractC46660Kkd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
