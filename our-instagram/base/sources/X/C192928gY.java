package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.8gY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192928gY implements InterfaceC102764kD {
    public Integer A00;
    public String A01;
    public C192968gc A02;
    public final JsonReader A03;

    /* JADX WARN: Type inference failed for: r0v18, types: [X.8gc] */
    @Override // X.InterfaceC102764kD
    public final Integer Csy() {
        Integer num;
        this.A01 = null;
        this.A02 = null;
        final JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = AbstractC192938gZ.A00;
        switch (iArr[peek.ordinal()]) {
            case 1:
                num = C05F.A0Y;
                break;
            case 2:
                num = C05F.A15;
                break;
            case 3:
                num = C05F.A1I;
                break;
            case 4:
                num = C05F.A00;
                break;
            case 5:
                num = C05F.A01;
                break;
            case 6:
                num = C05F.A0C;
                break;
            case 7:
                num = C05F.A0N;
                break;
            case 8:
                num = C05F.A02;
                break;
            case 9:
                num = C05F.A1F;
                break;
            case 10:
                num = C05F.A0j;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown JsonToken ");
                sb.append(peek);
                throw new IllegalStateException(sb.toString());
        }
        this.A00 = num;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A01 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A02 = new InterfaceC1120053p(jsonReader) { // from class: X.8gc
                    public Boolean A00;
                    public String A01;
                    public final JsonToken A02;

                    @Override // X.InterfaceC1120053p
                    public final boolean AE8() {
                        Boolean bool = this.A00;
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("type mis matching");
                        sb2.append(this.A02);
                        throw new IOException(sb2.toString());
                    }

                    @Override // X.InterfaceC1120053p
                    public final int COn() {
                        String str = this.A01;
                        if (str != null) {
                            return Integer.valueOf(str).intValue();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("type mis matching");
                        sb2.append(this.A02);
                        throw new IOException(sb2.toString());
                    }

                    @Override // X.InterfaceC1120053p
                    public final long Cmb() {
                        String str = this.A01;
                        if (str != null) {
                            return Long.valueOf(str).longValue();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("type mis matching");
                        sb2.append(this.A02);
                        throw new IOException(sb2.toString());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long, java.lang.Number] */
                    @Override // X.InterfaceC1120053p
                    public final Number Ctf() {
                        String str = this.A01;
                        if (str != 0) {
                            try {
                                str = Long.valueOf((String) str);
                                return str;
                            } catch (NumberFormatException unused) {
                                return Double.valueOf(str);
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("type mis matching");
                        sb2.append(this.A02);
                        throw new IOException(sb2.toString());
                    }

                    @Override // X.InterfaceC1120053p
                    public final String Ep1() {
                        String str = this.A01;
                        if (str != null) {
                            return str;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("type mis matching");
                        sb2.append(this.A02);
                        throw new IOException(sb2.toString());
                    }

                    @Override // X.InterfaceC1120053p
                    public final boolean isNull() {
                        if (this.A02 != JsonToken.NULL) {
                            return false;
                        }
                        return true;
                    }

                    {
                        JsonToken peek2 = jsonReader.peek();
                        this.A02 = peek2;
                        int i = AbstractC192978gd.A00[peek2.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3 && i != 4) {
                                    throw new IllegalStateException("can't read value");
                                }
                                this.A01 = jsonReader.nextString();
                                return;
                            }
                            jsonReader.nextNull();
                            return;
                        }
                        this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                };
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw new IllegalStateException("unknown JsonToken ");
        }
        return this.A00;
    }

    @Override // X.InterfaceC102764kD
    public final Object Awa() {
        return this.A03;
    }

    @Override // X.InterfaceC102764kD
    public final String E3u() {
        return this.A01;
    }

    @Override // X.InterfaceC102764kD
    public final Integer E3x() {
        return this.A00;
    }

    @Override // X.InterfaceC102764kD
    public final InterfaceC1120053p E3y() {
        return this.A02;
    }

    @Override // X.InterfaceC102764kD
    public final void EmB() {
        Integer num = this.A00;
        Integer num2 = C05F.A00;
        if (num == num2 || num == C05F.A0C) {
            int i = 1;
            while (true) {
                Integer Csy = Csy();
                if (Csy != num2 && Csy != C05F.A0C) {
                    if (Csy == C05F.A01 || Csy == C05F.A0N) {
                        i--;
                    }
                } else {
                    i++;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public C192928gY(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }
}
