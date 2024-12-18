package X;

import android.database.Cursor;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public final class MBW extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01 = 0;
    public final long A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBW(SecurityAlertLocalDataSource securityAlertLocalDataSource, InterfaceC23621Ds interfaceC23621Ds, int i, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = securityAlertLocalDataSource;
        this.A04 = z;
        this.A02 = j;
        this.A00 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A01 != 0) {
            SecurityAlertLocalDataSource securityAlertLocalDataSource = (SecurityAlertLocalDataSource) this.A03;
            boolean z = this.A04;
            return new MBW(securityAlertLocalDataSource, interfaceC23621Ds, this.A00, this.A02, z);
        }
        return new MBW((BT9) this.A03, interfaceC23621Ds, this.A02, this.A04);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        Long A0f;
        Long A0f2;
        String string;
        String string2;
        String string3;
        Long A0f3;
        Double valueOf;
        Double valueOf2;
        if (this.A01 != 0) {
            AbstractC09560e7.A00(obj);
            SecurityAlertLocalDataSource securityAlertLocalDataSource = (SecurityAlertLocalDataSource) this.A03;
            InterfaceC50511MRo A01 = securityAlertLocalDataSource.A02.A01();
            String str = securityAlertLocalDataSource.A00.userId;
            boolean z = this.A04;
            long j3 = this.A02;
            int i = this.A00;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("\n    SELECT *\n    FROM security_alert\n    WHERE user_id = ?\n      AND is_confirm = ?\n      AND created_timestamp_ms >= ?\n    ORDER BY created_timestamp_ms DESC\n    LIMIT ?\n  ", 4);
            A00.ADp(1, str);
            A00.ADi(2, z ? 1L : 0L);
            A00.ADi(3, j3);
            Cursor A002 = C49276LqW.A00(A00, (C49276LqW) A01, 4, i);
            try {
                int A012 = AbstractC37601ox.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A013 = AbstractC37601ox.A01(A002, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                int A014 = AbstractC37601ox.A01(A002, "crypto_mailbox_type");
                int A015 = AbstractC37601ox.A01(A002, "device_change_type");
                int A016 = AbstractC37601ox.A01(A002, AbstractC50531MSk.A02(0, 9, 46));
                int A017 = AbstractC37601ox.A01(A002, "created_timestamp_ms");
                int A018 = AbstractC37601ox.A01(A002, "first_read_timestamp_ms");
                int A019 = AbstractC37601ox.A01(A002, "model");
                int A0110 = AbstractC37601ox.A01(A002, "platform");
                int A0111 = AbstractC37601ox.A01(A002, "location");
                int A0112 = AbstractC37601ox.A01(A002, "activity_feed_read_timestamp_ms");
                int A0113 = AbstractC37601ox.A01(A002, Location.LATITUDE);
                int A0114 = AbstractC37601ox.A01(A002, "longitude");
                int A0115 = AbstractC37601ox.A01(A002, "is_confirm");
                ArrayList A11 = AbstractC43593JPy.A11(A002);
                while (A002.moveToNext()) {
                    String string4 = A002.getString(A012);
                    String string5 = A002.getString(A013);
                    int i2 = A002.getInt(A014);
                    int i3 = A002.getInt(A015);
                    int i4 = A002.getInt(A016);
                    if (A002.isNull(A017)) {
                        A0f = null;
                    } else {
                        A0f = JQ0.A0f(A002, A017);
                    }
                    if (A002.isNull(A018)) {
                        A0f2 = null;
                    } else {
                        A0f2 = JQ0.A0f(A002, A018);
                    }
                    if (A002.isNull(A019)) {
                        string = null;
                    } else {
                        string = A002.getString(A019);
                    }
                    if (A002.isNull(A0110)) {
                        string2 = null;
                    } else {
                        string2 = A002.getString(A0110);
                    }
                    if (A002.isNull(A0111)) {
                        string3 = null;
                    } else {
                        string3 = A002.getString(A0111);
                    }
                    if (A002.isNull(A0112)) {
                        A0f3 = null;
                    } else {
                        A0f3 = JQ0.A0f(A002, A0112);
                    }
                    if (A002.isNull(A0113)) {
                        valueOf = null;
                    } else {
                        valueOf = Double.valueOf(A002.getDouble(A0113));
                    }
                    if (A002.isNull(A0114)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Double.valueOf(A002.getDouble(A0114));
                    }
                    A11.add(new C45091JxL(valueOf, valueOf2, A0f, A0f2, A0f3, string4, string5, string, string2, string3, i2, i3, i4, AbstractC167007dF.A1M(A002.getInt(A0115))));
                }
                A002.close();
                A00.A00();
                ArrayList A0q = AbstractC167017dG.A0q(A11);
                Iterator it = A11.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC46915Kow.A00((C45091JxL) it.next()));
                }
                return A0q;
            } catch (Throwable th) {
                A002.close();
                A00.A00();
                throw th;
            }
        }
        C1JX c1jx = C1JX.A02;
        int i5 = this.A00;
        if (i5 != 0) {
            if (i5 != 1 && i5 != 2) {
                throw AbstractC166987dD.A13();
            }
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            boolean z2 = this.A04;
            NestedScrollDispatcher nestedScrollDispatcher = ((BT9) this.A03).A0M;
            if (!z2) {
                j = 0;
                j2 = this.A02;
                this.A00 = 1;
            } else {
                j = this.A02;
                j2 = 0;
                this.A00 = 2;
            }
            if (nestedScrollDispatcher.A02(this, j, j2) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBW) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBW(BT9 bt9, InterfaceC23621Ds interfaceC23621Ds, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = z;
        this.A03 = bt9;
        this.A02 = j;
    }
}
