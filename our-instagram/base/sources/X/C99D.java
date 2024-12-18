package X;

/* renamed from: X.99D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99D implements C99E {
    public byte[] A00;

    @Override // X.C99E
    public final String ANm(CharSequence charSequence) {
        if (AbstractC23058AEp.A00(charSequence)) {
            byte[] bArr = this.A00;
            boolean z = false;
            if (bArr.length == 8) {
                z = true;
            }
            C0J8.A06(z);
            int length = (charSequence.length() - 7) / 2;
            int i = 0;
            int i2 = 0;
            while (charSequence.charAt(i2) == "\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i)) {
                i2++;
                i++;
                if (i >= 7) {
                    byte[] bArr2 = new byte[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        byte charAt = (byte) (((byte) (((byte) (((byte) charSequence.charAt(i2)) - 65)) << 4)) & (-16));
                        i2 = i2 + 1 + 1;
                        bArr2[i3] = (byte) (((byte) (charAt | ((byte) (((byte) (((byte) (((byte) charSequence.charAt(r8)) - 65)) << 0)) & 15)))) ^ bArr[i3 % 8]);
                    }
                    return new String(bArr2, AbstractC23058AEp.A00);
                }
            }
            return charSequence.toString();
        }
        throw new RuntimeException("Value is not vaulted");
    }

    @Override // X.C99E
    public final String ARy(CharSequence charSequence) {
        if (!AbstractC23058AEp.A00(charSequence)) {
            byte[] bArr = this.A00;
            boolean z = false;
            if (bArr.length == 8) {
                z = true;
            }
            C0J8.A06(z);
            byte[] bytes = charSequence.toString().getBytes(AbstractC23058AEp.A00);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            do {
                sb.append("\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i));
                i++;
            } while (i < 7);
            for (int i2 = 0; i2 < bytes.length; i2++) {
                byte b = (byte) (bArr[i2 % 8] ^ bytes[i2]);
                byte b2 = (byte) (((byte) (((byte) (b >> 4)) & 15)) + 65);
                sb.append((char) b2);
                sb.append((char) ((byte) (((byte) (((byte) (b >> 0)) & 15)) + 65)));
            }
            return sb.toString();
        }
        throw new RuntimeException("Value is already vaulted");
    }
}
