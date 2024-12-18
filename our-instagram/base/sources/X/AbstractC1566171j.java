package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.71j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1566171j {
    public static boolean A05(User user) {
        if (user == null) {
            return false;
        }
        boolean z = false;
        if (user.A03.Ayj() != null) {
            z = true;
        }
        return (C2E7.A00(user) || C2E7.A01(user)) && z;
    }

    public static InterfaceC111194zh A00(SMBPartnerType sMBPartnerType, User user) {
        if (sMBPartnerType != null) {
            if (sMBPartnerType.equals(SMBPartnerType.A09)) {
                return user.A03.Bxy();
            }
            if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                return user.A03.Bxv();
            }
            if (sMBPartnerType.equals(SMBPartnerType.A05)) {
                return user.A03.Bxw();
            }
            return null;
        }
        return null;
    }

    public static String A01(Context context, SMBPartnerType sMBPartnerType, String str) {
        int i;
        boolean equals = str.equals("sticker");
        boolean equals2 = sMBPartnerType.equals(SMBPartnerType.A09);
        if (equals) {
            if (equals2) {
                context.getClass();
                i = 2131952360;
            } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
                context.getClass();
                i = 2131952297;
            } else {
                return null;
            }
        } else if (equals2) {
            context.getClass();
            i = 2131952359;
        } else if (sMBPartnerType.equals(SMBPartnerType.A06)) {
            context.getClass();
            i = 2131952296;
        } else if (sMBPartnerType.equals(SMBPartnerType.A05)) {
            context.getClass();
            i = 2131952301;
        } else {
            return null;
        }
        return context.getString(i);
    }

    public static String A02(SMBPartnerType sMBPartnerType) {
        if (sMBPartnerType == null) {
            return "";
        }
        int ordinal = sMBPartnerType.ordinal();
        if (ordinal != 6) {
            if (ordinal != 3) {
                if (ordinal == 2) {
                    return "https://help.instagram.com/242451420235904";
                }
                throw new UnsupportedOperationException(AnonymousClass001.A0R("Unexpected partnerType, received ", sMBPartnerType.toString()));
            }
            return "https://help.instagram.com/661624171320775";
        }
        return "https://help.instagram.com/3180219732057386";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String A03(FKE fke) {
        ImmutableList of;
        String str;
        ImmutableList of2;
        ImmutableList of3;
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        List list = fke.A02;
        if (list != null) {
            of = ImmutableList.copyOf((Collection) list);
        } else {
            of = ImmutableList.of();
        }
        if (of != null) {
            List list2 = fke.A02;
            if (list2 != null) {
                of2 = ImmutableList.copyOf((Collection) list2);
            } else {
                of2 = ImmutableList.of();
            }
            if (!of2.isEmpty()) {
                List list3 = fke.A02;
                if (list3 != null) {
                    of3 = ImmutableList.copyOf((Collection) list3);
                } else {
                    of3 = ImmutableList.of();
                }
                str = (String) of3.get(0);
                sb.append(str);
                return sb.toString();
            }
        }
        sb.append(fke.A01.toLowerCase(Locale.US));
        str = ".com";
        sb.append(str);
        return sb.toString();
    }

    public static boolean A04(FragmentActivity fragmentActivity, ActionButtonPartnerType actionButtonPartnerType, SMBPartnerType sMBPartnerType, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str));
        String A00 = AbstractC58317Pt9.A00(4);
        Intent addCategory = intent.addCategory(A00);
        String A002 = AbstractC58317Pt9.A00(674);
        Intent addFlags = addCategory.addCategory(A002).addFlags(335544320);
        if (SMBPartnerType.A05.equals(sMBPartnerType)) {
            return C12260kU.A0B(fragmentActivity, addFlags);
        }
        if (SMBPartnerType.A06.equals(sMBPartnerType) || actionButtonPartnerType == ActionButtonPartnerType.A04) {
            String str2 = AbstractC14490oL.A02;
            PackageManager packageManager = fragmentActivity.getPackageManager();
            if (packageManager != null) {
                Intent action = new Intent().addCategory(A00).addCategory(A002).setAction("android.intent.action.VIEW");
                Intent data = new Intent(action).setData(AbstractC08820cl.A03(str));
                Intent data2 = new Intent(action).setData(AbstractC08820cl.A03("http://example.com"));
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(data2, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                HashSet hashSet = new HashSet();
                Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    activityInfo.getClass();
                    hashSet.add(((PackageItemInfo) activityInfo).packageName);
                }
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                    activityInfo2.getClass();
                    if (!hashSet.contains(((PackageItemInfo) activityInfo2).packageName)) {
                        ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                        activityInfo3.getClass();
                        if (C0JS.A04(packageManager, ((PackageItemInfo) activityInfo3).packageName)) {
                            return C12260kU.A0E(fragmentActivity, addFlags);
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
