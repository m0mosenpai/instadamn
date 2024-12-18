package com.facebook.mill.immutablecursor;

import X.AbstractC009903n;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC43593JPy;
import X.C14360o3;
import X.C17u;
import X.C70009VzU;
import X.C70010VzV;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class TypeSqlDatabaseImpl {
    public final SqliteHolder sqliteHolder;

    public TypeSqlDatabaseImpl(SqliteHolder sqliteHolder) {
        C14360o3.A0B(sqliteHolder, 1);
        this.sqliteHolder = sqliteHolder;
        C70010VzV.A00();
        C70009VzU.A00();
    }

    private final native boolean execSQL(SqliteHolder sqliteHolder, String str, List list);

    private final native TypeSqlQuery rawQuery(SqliteHolder sqliteHolder, String str, List list);

    public void exec(Object... objArr) {
        Object[] copyOf;
        C14360o3.A0B(objArr, 0);
        int length = objArr.length;
        boolean z = !AbstractC167007dF.A1N(length);
        Integer valueOf = Integer.valueOf(length);
        if (z) {
            Object obj = objArr[0];
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (length == 1) {
                copyOf = new Object[0];
            } else {
                Object[] array = AbstractC009903n.A0D(new C17u(1, length - 1), objArr).toArray(new Object[0]);
                copyOf = Arrays.copyOf(array, array.length);
            }
            exec(str, copyOf);
            return;
        }
        throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement argument size = %d", valueOf));
    }

    public SqliteHolder getSqliteHolder() {
        return this.sqliteHolder;
    }

    public TypeSqlQuery prepare(byte[] bArr, String str, Object... objArr) {
        AbstractC167027dH.A12(bArr, str, objArr);
        TypeSqlQuery rawQuery = rawQuery(this.sqliteHolder, str, AbstractC009903n.A0J(objArr));
        rawQuery.setColumnTypes(bArr);
        return rawQuery;
    }

    public void exec(String str, Object... objArr) {
        List asList;
        AbstractC167017dG.A1N(str, objArr);
        SqliteHolder sqliteHolder = this.sqliteHolder;
        if (objArr.length == 0) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
            C14360o3.A07(asList);
        }
        execSQL(sqliteHolder, str, asList);
    }

    public TypeSqlQuery prepare(Object... objArr) {
        Object[] copyOf;
        C14360o3.A0B(objArr, 0);
        int length = objArr.length;
        boolean A1Z = AbstractC43593JPy.A1Z(length, 2);
        Integer valueOf = Integer.valueOf(length);
        if (A1Z) {
            Object obj = objArr[0];
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj;
            Object obj2 = objArr[1];
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            if (length == 2) {
                copyOf = new Object[0];
            } else {
                Object[] array = AbstractC009903n.A0D(new C17u(2, length - 1), objArr).toArray(new Object[0]);
                copyOf = Arrays.copyOf(array, array.length);
            }
            return prepare(bArr, str, copyOf);
        }
        throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement and columnTypes arguments size = %d", valueOf));
    }
}
