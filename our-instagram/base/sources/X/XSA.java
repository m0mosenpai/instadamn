package X;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes12.dex */
public final class XSA extends YAA {
    @Override // X.YAA, X.YPZ
    public final /* bridge */ /* synthetic */ YPZ EP1(Boolean bool, int i) {
        super.EP1(bool, 2);
        return this;
    }

    @Override // X.YPZ
    public final long ABp() {
        SQLiteStatement sQLiteStatement;
        String str;
        SQLiteDatabase AX9 = this.A03.AX9();
        Y0B y0b = this.A01;
        String str2 = this.A04;
        synchronized (y0b) {
            C72776Xmv A00 = Y0B.A00(AX9, y0b);
            sQLiteStatement = A00.A02;
            if (sQLiteStatement == null) {
                if (str2 == null) {
                    String str3 = y0b.A00;
                    String[] strArr = y0b.A02;
                    String str4 = y0b.A01;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("UPDATE ");
                    A1C.append(str3);
                    A1C.append(" SET ");
                    for (int i = 0; i < strArr.length; i++) {
                        if (i > 0) {
                            str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
                        } else {
                            str = "";
                        }
                        A1C.append(str);
                        A1C.append(strArr[i]);
                        A1C.append("=?");
                    }
                    A1C.append(" WHERE ");
                    str2 = AbstractC166997dE.A0x(str4, A1C);
                }
                sQLiteStatement = AX9.compileStatement(str2);
                A00.A02 = sQLiteStatement;
            }
        }
        Object[] objArr = this.A06;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            DatabaseUtils.bindObjectToProgram(sQLiteStatement, i3, objArr[i2]);
            i2 = i3;
        }
        try {
            C0fW.A00(-1224059165);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            C0fW.A00(1913163113);
            long j = executeUpdateDelete;
            C72675Xku c72675Xku = this.A02;
            if (c72675Xku != null) {
                c72675Xku.A00.A06.A00++;
            }
            return j;
        } finally {
            sQLiteStatement.clearBindings();
        }
    }

    @Override // X.YAA
    public final /* bridge */ /* synthetic */ YPZ A00(int i) {
        super.A00(i);
        return this;
    }

    @Override // X.YAA, X.YPZ
    public final /* bridge */ /* synthetic */ YPZ EOz(Long l, int i) {
        super.EOz(l, i);
        return this;
    }

    @Override // X.YAA, X.YPZ
    public final /* bridge */ /* synthetic */ YPZ EP0(String str, int i) {
        super.EP0(str, i);
        return this;
    }
}
