package com.facebook.secure.fileprovider.common;

/* loaded from: classes.dex */
public class StatInfo {
    public long device;
    public long inode;
    public int ownerGid;
    public int ownerUid;

    public static StatInfo newInstance(int i, int i2, long j, long j2) {
        return new StatInfo(i, i2, j, j2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stat{ownerUid=");
        sb.append(this.ownerUid);
        sb.append(",ownerGid=");
        sb.append(this.ownerGid);
        sb.append(",inode=");
        sb.append(this.inode);
        sb.append(",device=");
        sb.append(this.device);
        sb.append("}");
        return sb.toString();
    }

    public StatInfo(int i, int i2, long j, long j2) {
        this.ownerUid = i;
        this.ownerGid = i2;
        this.inode = j;
        this.device = j2;
    }
}
