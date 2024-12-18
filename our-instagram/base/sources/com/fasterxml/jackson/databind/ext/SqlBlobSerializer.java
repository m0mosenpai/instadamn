package com.fasterxml.jackson.databind.ext;

import X.AbstractC63023Sar;
import X.AbstractC913245l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C102314j6;
import X.C16R;
import X.C45T;
import X.SX7;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.sql.Blob;
import java.sql.SQLException;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class SqlBlobSerializer extends StdScalarSerializer {
    public SqlBlobSerializer() {
        super(Blob.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Blob blob = (Blob) obj;
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0E, abstractC63023Sar, blob);
        A03(anonymousClass182, abstractC913345m, blob);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        A03(anonymousClass182, abstractC913345m, (Blob) obj);
    }

    public static final void A03(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Blob blob) {
        try {
            anonymousClass182.A0Y(((C45T) abstractC913345m.A05).A01.A00, blob.getBinaryStream(), -1);
        } catch (SQLException e) {
            throw new C102314j6(((AbstractC913245l) abstractC913345m).A00, "Failed to access `java.sql.Blob` value to write as binary value", e);
        }
    }
}
