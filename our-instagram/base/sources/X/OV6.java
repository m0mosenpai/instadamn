package X;

import android.content.Context;
import android.util.Patterns;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OV6 {
    public static final OV6 A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002a. Please report as an issue. */
    public final boolean A00(Context context, LeadGenFormBaseQuestion leadGenFormBaseQuestion, List list, boolean z, boolean z2) {
        Object obj;
        List list2;
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        String str = leadGenFormBaseQuestion.A00;
        VFS vfs = (VFS) EnumHelper.A00(leadGenFormBaseQuestion.A08, VFS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (vfs != VFS.EMAIL) {
            AbstractC53634Nnf A002 = S54.A00(vfs);
            if (A002 != null) {
                if (A002.A00(str) != C05F.A00) {
                    return false;
                }
            } else {
                switch (leadGenFormBaseQuestion.A03.ordinal()) {
                    case 4:
                    case 23:
                        break;
                    case 5:
                    case 22:
                        if (z2 && context != null) {
                            if (Patterns.PHONE.matcher(str).matches()) {
                                PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
                                try {
                                    AnonymousClass793 A0F = A01.A0F(str, null);
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (PhoneNumberUtil.A01(context).A0A(((C38687GzS) obj).A01) == A0F.A00) {
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    C38687GzS c38687GzS = (C38687GzS) obj;
                                    if (c38687GzS != null && (list2 = (List) c38687GzS.A00) != null) {
                                        if (!list2.isEmpty()) {
                                            Iterator it2 = list2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    Object next = it2.next();
                                                    if (AbstractC002300n.A0h(String.valueOf(A0F.A02), (String) next, false)) {
                                                        if (next != null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return A01.A0N(A0F);
                                } catch (C40f unused) {
                                    return false;
                                }
                            }
                            return false;
                        }
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case 14:
                    case Process.SIGTERM /* 15 */:
                        if (!z) {
                            return !AbstractC13670mt.A0A(str);
                        }
                        break;
                    default:
                        return true;
                }
            }
            return true;
        }
        return F88.A00(str);
    }
}
