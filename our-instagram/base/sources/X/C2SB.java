package X;

import android.content.ContentValues;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2SB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SB extends C2RB {
    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, boolean z) {
        try {
            C83403nh A00 = C83403nh.A00(c16l, null, z);
            if (A00 != null && !z) {
                return A00(A00);
            }
            return A00;
        } catch (IOException unused) {
            C0w9.A03("DirectMessageSQLiteTable", "Error parsing json string into DirectMessage.");
            return null;
        }
    }

    @Override // X.C2RB
    public final String A0E() {
        return DialogModule.KEY_MESSAGE;
    }

    @Override // X.C2RB
    public final String A0F() {
        return "messages";
    }

    public final ArrayList A0J(C2DX c2dx, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(c2dx, 1);
        AbstractC09800fd.A01("DirectMessageSQLiteTable.parseMessages", -1889937526);
        try {
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) it.next();
                    Object A0C = A0C(C07950bF.A04.A02(this.A00, bArr), false);
                    if (A0C != null) {
                        arrayList.add(A0C);
                    }
                    i += bArr.length;
                }
                c2dx.A03("message_byte_size:", i);
            } catch (C90173zy | IOException unused) {
                C18950wb.A00.AEp("Error parsing json.", 20134884).report();
            }
            AbstractC09800fd.A00(-352003180);
            return arrayList;
        } catch (Throwable th) {
            AbstractC09800fd.A00(113951048);
            throw th;
        }
    }

    public final void A0M(DirectThreadKey directThreadKey, String str, String str2) {
        String A0S;
        C14360o3.A0B(directThreadKey, 0);
        String A04 = A04();
        String A01 = A01(directThreadKey);
        String str3 = null;
        if (str2 == null) {
            A0S = null;
        } else {
            A0S = AnonymousClass001.A0S("client_item_id=='", str2, '\'');
        }
        if (str != null) {
            str3 = AnonymousClass001.A0S("server_item_id=='", str, '\'');
        }
        if (A0S != null) {
            if (str3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append('(');
                sb.append(A0S);
                sb.append(" AND server_item_id IS NULL) OR (");
                sb.append(str3);
                sb.append(')');
                A0S = sb.toString();
            }
        } else if (str3 != null) {
            A0S = str3;
        } else {
            throw new IllegalArgumentException("Both message ID and client context is null.");
        }
        A03(C2SA.A00(A04, A01, A0S));
    }

    private final C83403nh A00(C83403nh c83403nh) {
        DirectThreadKey directThreadKey = c83403nh.A0y;
        if (directThreadKey == null) {
            return null;
        }
        List list = directThreadKey.A02;
        if (list != null) {
            UserSession userSession = this.A00;
            if (list.contains(userSession.userId)) {
                ArrayList arrayList = new ArrayList(directThreadKey.A02);
                arrayList.remove(userSession.userId);
                c83403nh.A17(new DirectThreadKey(directThreadKey.A00, arrayList));
            }
        }
        if (C05F.A00 != c83403nh.A1F || c83403nh.A0h() == null) {
            return c83403nh;
        }
        c83403nh.A1m(C05F.A0j);
        return c83403nh;
    }

    public static final String A01(DirectThreadKey directThreadKey) {
        String str;
        String str2 = directThreadKey.A00;
        String str3 = null;
        if (str2 != null) {
            str = AnonymousClass001.A0S("thread_id=='", str2, '\'');
        } else {
            str = null;
        }
        List list = directThreadKey.A02;
        if (list != null) {
            str3 = AnonymousClass001.A0g("(thread_id IS NULL AND recipient_ids=='", AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list), "')");
        }
        if (str != null) {
            if (str3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append('(');
                sb.append(str);
                sb.append(" OR ");
                sb.append(str3);
                sb.append(')');
                return sb.toString();
            }
            return str;
        }
        return str3;
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        String str;
        C83403nh c83403nh = (C83403nh) obj;
        C14360o3.A0B(c83403nh, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A00.userId);
        contentValues.put("server_item_id", c83403nh.A0h());
        contentValues.put("client_item_id", c83403nh.A0g());
        DirectThreadKey directThreadKey = c83403nh.A0y;
        if (directThreadKey != null) {
            contentValues.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
            DirectThreadKey directThreadKey2 = c83403nh.A0y;
            if (directThreadKey2 != null) {
                contentValues.put("recipient_ids", AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, directThreadKey2.A02));
                contentValues.put("timestamp", Long.valueOf(c83403nh.C8i()));
                C2EY c2ey = c83403nh.A10;
                if (c2ey != null) {
                    contentValues.put("message_type", c2ey.A00);
                }
                if (c83403nh.A10 == C2EY.A1i) {
                    Object obj2 = c83403nh.A1T;
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                    str = (String) obj2;
                } else {
                    str = null;
                }
                contentValues.put("text", str);
                contentValues.put(DialogModule.KEY_MESSAGE, A0A(byteArrayOutputStream, c83403nh));
                return contentValues;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        C83693oE c83693oE;
        C83403nh c83403nh = (C83403nh) obj;
        C14360o3.A0B(c83403nh, 1);
        C83693oE A00 = AbstractC83823oR.A00(null);
        if (A00 != null) {
            c83693oE = AbstractC1345466e.A02(A00);
        } else {
            c83693oE = null;
        }
        C83403nh A0N = c83403nh.A0N(userSession, c83693oE);
        if (A0N == null) {
            return null;
        }
        return A00(A0N);
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ void A0G(AnonymousClass182 anonymousClass182, Object obj) {
        C83403nh c83403nh = (C83403nh) obj;
        C14360o3.A0B(c83403nh, 1);
        AbstractC126255nM.A00(anonymousClass182, c83403nh);
    }

    public final ArrayList A0H() {
        AbstractC09800fd.A01("DirectMessageSQLiteTable.getAllRawMessagesSortedByThread", -2117991774);
        try {
            ArrayList A06 = A06(A04(), "thread_id ASC");
            AbstractC09800fd.A00(-145580148);
            return A06;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1248343437);
            throw th;
        }
    }

    public final ArrayList A0I(ImmutableList immutableList, ImmutableList immutableList2) {
        String A00;
        AbstractC09800fd.A01("DirectMessageSQLiteTable.getFilteredRawMessagesSortedByThread", -2122814467);
        try {
            String A01 = C2SP.A01(immutableList, immutableList2);
            if (A01 == null) {
                A00 = A04();
            } else {
                A00 = C2SA.A00(A04(), A01);
            }
            ArrayList A06 = A06(A00, "thread_id ASC");
            AbstractC09800fd.A00(-1989749875);
            return A06;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1066692862);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A0K(X.C2DX r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2SB.A0K(X.2DX, byte[]):java.util.ArrayList");
    }

    public final void A0L(DirectThreadKey directThreadKey) {
        A03(C2SA.A00(A04(), A01(directThreadKey)));
    }

    public final void A0N(List list) {
        String A04 = A04();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        C14360o3.A07(copyOf);
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        A03(C2SA.A00(A04, C2SP.A01(copyOf, of)));
    }
}
