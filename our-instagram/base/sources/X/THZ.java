package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* loaded from: classes10.dex */
public final class THZ implements Externalizable {
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public String A01 = "";
    public String A02 = "";
    public String A00 = "";

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.A04);
        if (this.A04) {
            objectOutput.writeUTF(this.A01);
        }
        objectOutput.writeBoolean(this.A05);
        if (this.A05) {
            objectOutput.writeUTF(this.A02);
        }
        objectOutput.writeBoolean(this.A03);
        if (this.A03) {
            objectOutput.writeUTF(this.A00);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.A04 = true;
            this.A01 = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.A05 = true;
            this.A02 = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.A03 = true;
            this.A00 = readUTF3;
        }
    }
}
